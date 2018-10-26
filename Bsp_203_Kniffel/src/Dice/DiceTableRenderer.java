package Dice;

import BL.KniffelValue;
import BL.MyInteger;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class DiceTableRenderer implements TableCellRenderer {

    private ImageIcon[] icons = {new ImageIcon("src\\res\\Alea_1.png"), new ImageIcon("src\\res\\Alea_2.png"),
        new ImageIcon("src\\res\\Alea_3.png"), new ImageIcon("src\\res\\Alea_4.png"),
        new ImageIcon("src\\res\\Alea_5.png"),new ImageIcon("src\\res\\Alea_6.png")};
    private DiceTableModel model = new DiceTableModel();
    private MyInteger mj = new MyInteger(0,false);
    private KniffelValue values = new KniffelValue();
    private int[] rolledValues = new int[5];
    private int count = 0;
    
    public int[] getValues(){
        return values.getRolledValues();
    }
    
    public KniffelValue getValue(){
        return values;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel("", SwingConstants.CENTER);
        label.setOpaque(true);
        model = (DiceTableModel) table.getModel();
        if(value instanceof MyInteger){
            mj = (MyInteger) value;
        }
        if(count == 5){
            count = 0;
        }
        MyInteger mi = new MyInteger(mj.getValue(),false);
        rolledValues[count] = mi.getValue()+1; //TODO
        label.setIcon(icons[mi.getValue()]);
        if(mj.isSelected()){
            label.setBackground(Color.red);
        }else{
            label.setBackground(Color.white);
        }
        
        count++;
        values.setRolledValues(rolledValues);
        return label;
    }
}





















//try {
//            if (model.getDice().get(table.getSelectedColumn()) == (int) value) {
//                label.setBackground(Color.red);
//            } else {
//                label.setBackground(Color.white);
//            }
//
//        } catch (Exception e) {}