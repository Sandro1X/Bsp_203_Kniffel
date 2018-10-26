package BL;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class KniffelTableRenderer implements TableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        KniffelEntry e = (KniffelEntry) value;
        JCheckBox cb = new JCheckBox();
        cb.setVisible(true);
        label.setOpaque(true);
        
        label.setBackground(Color.white);
        switch(column){
            case 0:  label.setText(e.getName());break;
            case 1: 
                cb.setSelected(e.isSelected());
                return cb;
            case 2: label.setText(e.getCalcPoints()+"");
        }
        return label;
    }

}
