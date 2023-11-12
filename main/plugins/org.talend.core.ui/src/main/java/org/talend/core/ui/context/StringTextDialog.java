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
package org.talend.core.ui.context;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.talend.commons.ui.runtime.ITalendThemeService;
import org.talend.commons.ui.swt.colorstyledtext.ColorStyledText;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class StringTextDialog extends Dialog {

    private String content;

    private Text text;

    public StringTextDialog(Shell parentShell) {
        super(parentShell);
    }

    public StringTextDialog(Shell parentShell, String content) {
        super(parentShell);
        this.content = content;
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText("Enter the value");
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 640;
        gd.heightHint = 260;
        composite.setLayoutData(gd);
        composite.setLayout(new GridLayout());
        text = new Text(composite, SWT.WRAP | SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.LEFT);
        text.setForeground(ITalendThemeService.getColor(ColorStyledText.PREFERENCE_COLOR_FOREGROUND).orElse(null));
        text.setBackground(ITalendThemeService.getColor(ColorStyledText.PREFERENCE_COLOR_BACKGROUND).orElse(null));
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
        text.setText(content);
        text.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                content = text.getText();
            }
        });
        return composite;
    }

    public String getTextContent() {
        return content;
    }

}
