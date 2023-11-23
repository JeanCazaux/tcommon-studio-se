// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

/*
 * Created by bhe on Dec 24, 2019
 */
public class JavaVersion implements Comparable<JavaVersion> {

    private static final Logger LOGGER = Logger.getLogger(JavaVersion.class.getCanonicalName());

    private int major, minor, buildNumber, security;

    public JavaVersion(String v) {
        parseVersion(v);
    }

    /**
     * @return the major
     */
    public int getMajor() {
        return major;
    }

    /**
     * @return the minor
     */
    public int getMinor() {
        return minor;
    }

    /**
     * @return the buildNumber
     */
    public int getBuildNumber() {
        return buildNumber;
    }

    /**
     * @return the security
     */
    public int getSecurity() {
        return security;
    }

    @Override
    public int compareTo(JavaVersion o) {
        if (this.major - o.major == 0) {
            if (this.minor - o.minor == 0) {
                if (this.buildNumber - o.buildNumber == 0) {
                    return this.security - o.security;
                }
                return this.buildNumber - o.buildNumber;
            }
            return this.minor - o.minor;
        }
        return this.major - o.major;
    }

    private String normalizeVersion(String v) {
        v = v.replaceAll("[^\\d._]", "");
        if (v.isEmpty()) {
            v = "0";
        }
        return v;
    }

    private void parseVersion(String v) {
        if (v == null || v.isEmpty()) {
            return;
        }

        String[] version = v.split("[\\._]");

        try {
            this.major = Integer.parseInt(normalizeVersion(version[0]));
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Major version parse error of " + v, e);
        }

        if (version.length > 1 && !StringUtils.isEmpty(version[1])) {
            try {
                this.minor = Integer.parseInt(normalizeVersion(version[1]));
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Minor version parse error of " + v, e);
            }
        }

        if (version.length > 2 && !StringUtils.isEmpty(version[2])) {
            try {
                this.buildNumber = Integer.parseInt(normalizeVersion(version[2]));
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Build number parse error of " + v, e);
            }
        }

        if (version.length > 3 && !StringUtils.isEmpty(version[3])) {
            // strip non number part if any
            String securityNumber = version[3];
            for (int i = 0; i < securityNumber.length(); i++) {
                char c = securityNumber.charAt(i);
                if (c > '9' || c < '0') {
                    securityNumber = securityNumber.substring(0, i);
                    break;
                }
            }
            try {
                this.security = Integer.parseInt(securityNumber);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Security version parse error of " + v, e);
            }
        }
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + this.major;
        result = result * prime + this.minor;
        result = result * prime + this.buildNumber;
        result = result * prime + this.security;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaVersion)) {
            return false;
        }
        JavaVersion that = (JavaVersion) obj;
        return this.compareTo(that) == 0 ? true : false;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.major);
        sb.append(".");
        sb.append(this.minor);
        sb.append(".");
        sb.append(this.buildNumber);
        if (this.security > 0) {
            sb.append("_");
            sb.append(this.security);
        }
        return sb.toString();
    }
}