/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultis;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author tungoc
 */
public class ItemComboboxRender extends JLabel implements ListCellRenderer{
    
    @Override
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Object[] itemData =(Object[])value;        
        setText((String)itemData[1]);
        return this;    
    } 
}