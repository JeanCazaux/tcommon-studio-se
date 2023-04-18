// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ICustomUI extends IUIEventHandler {

    String getId();

    void run();
    
    void dispatchUIEvent(IUIEvent event);

    static enum BuiltinEvent {
        open,
        ok,
        apply,
        close,
        cancel;
    }

    static enum BuiltinParams {
        uiKey,
        title,
        message;
    }

}
