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
package org.talend.core.repository.model.ldap;

import java.security.cert.X509Certificate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author PCW created on Nov 28, 2023
 *
 */
public class LDAPCATrusterTest {
    
    
    @Test
    public void testGetAcceptedIssuers() {
        LDAPCATruster truster = new LDAPCATruster(null);
        X509Certificate[] certs = truster.getAcceptedIssuers();
        Assert.assertTrue(certs.length > 1);
    }

}
