// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
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

/**
 * @author PCW created on Nov 20, 2023
 *
 */
@SuppressWarnings("serial")
public class VersionException extends RuntimeException {

    public static final int ERR_JAVA_VERSION_UPGRADE_REQUIRED = 0;

    public static final int ERR_JAVA_VERSION_NOT_SUPPORTED = 1;

    private int errID;

    public VersionException(String msg) {
        super(msg);
    }

    public VersionException(int errID, String msg) {
        this(msg);
        this.errID = errID;
    }

    public int getErrID() {
        return this.errID;
    }

    public boolean requireUpgrade() {
        return this.errID == ERR_JAVA_VERSION_UPGRADE_REQUIRED;
    }

}
