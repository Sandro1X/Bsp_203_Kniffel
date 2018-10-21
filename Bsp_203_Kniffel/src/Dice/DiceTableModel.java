package Dice;

import BL.MyInteger;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DiceTableModel extends AbstractTableModel {

    private ArrayList<MyInteger> dice = new ArrayList<>();

    public void add(MyInteger i) {
        dice.add(i);
        fireTableDataChanged();
    }
    
    public void delete(int i){
        dice.remove(i);
    }

    public void changeState(int i) {
        if (dice.get(i).isSelected()) {
            dice.get(i).setSelected(false);
        } else {
            dice.get(i).setSelected(true);
        }
        fireTableStructureChanged();
    }

    public ArrayList<MyInteger> getDice() {
        return dice;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rows, int cols) {
        return dice.get(cols);
    }

}
