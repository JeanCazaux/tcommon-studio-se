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
package org.talend.commons.ui.swt.dnd;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class DNDTableViewerHelper {

    public static void addDndSupport(final TableViewer tableViewer) {
        if(tableViewer == null) {
            return;
        }
        
        DropTarget dropTarget = new DropTarget(tableViewer.getTable(), DND.DROP_DEFAULT | DND.DROP_COPY);
        dropTarget.setTransfer(new Transfer[] { TextTransfer.getInstance()});
        dropTarget.addDropListener(new DropTargetAdapter() {

            @Override
            public void dragOver(DropTargetEvent event) {
                if(!isColumnDroptable(tableViewer, getTargetColumn(event))) {
                    event.detail = DND.DROP_NONE;
                } else {
                    event.detail = DND.DROP_COPY;
                }
            }

            @Override
            public void dragEnter(DropTargetEvent event) {
                // Allow dropping text only
                for (int i = 0, n = event.dataTypes.length; i < n; i++) {
                    if (TextTransfer.getInstance().isSupportedType(event.dataTypes[i])) {
                        event.currentDataType = event.dataTypes[i];
                    }
                }
            }
            
            @Override
            public void drop(DropTargetEvent event) {
                if (ifAnyTextDropped(event)) {
                    pasteToTable(event);
                }
            }

            private boolean ifAnyTextDropped(DropTargetEvent event) {
                return TextTransfer.getInstance().isSupportedType(event.currentDataType);
            }
            
            private void pasteToTable(DropTargetEvent event) {
                int columnIndex = getTargetColumn(event);
                
                if(isColumnDroptable(tableViewer, columnIndex)) {
                    TableItem item = (TableItem) event.item;
                    String originContext = item.getText(columnIndex);
                    
                    String idColmn = (String) tableViewer.getColumnProperties()[columnIndex];
                    ICellModifier cellModifier = tableViewer.getCellModifier();
                    cellModifier.modify(event.item, idColmn, originContext + (String)event.data);
                }
            }

            private boolean isColumnDroptable(final TableViewer tableViewer, int columnIndex) {
                CellEditor[] cellEditors = tableViewer.getCellEditors();
                boolean isTextCellEditor = cellEditors[columnIndex] != null 
                        && cellEditors[columnIndex].getControl() instanceof Text;
                return isTextCellEditor;
            }

            private int getTargetColumn(DropTargetEvent event) {
                Point posInTable = tableViewer.getTable().toControl(event.x, event.y);
                ViewerCell cell = tableViewer.getCell(posInTable);
                int columnIndex = 0;
                if(cell != null) {
                    columnIndex = cell.getColumnIndex();
                }
                return columnIndex;
            }
        });
    }
}
