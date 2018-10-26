package BL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class KniffelTableModel extends AbstractTableModel {

    private String[] colNames = {"Spiel", "Wahl", "Punkte"};
    private ArrayList<KniffelEntry> entries = new ArrayList<>();
    
    public void add(KniffelEntry e) {
        entries.add(e);
        fireTableRowsInserted(entries.size() - 1, entries.size() - 1);
    }
    
    public void selectCb(int i) throws Exception {
//        if(entries.get(i).isSelected()){
//            entries.get(i).setSelected(false);
//        }else{
//            entries.get(i).setSelected(true);
//        }
        if(!entries.get(i).isSelected()){
            entries.get(i).setSelected(true);
        }else{
            throw new Exception("Bereits ausgewählt");
        }
        
        fireTableStructureChanged();
    }
    
    public KniffelEntry getEntry(int i) {
        return entries.get(i);
    }
    
    public ArrayList<KniffelEntry> getEntries() {
        return entries;
    }
    
    @Override
    public int getRowCount() {
        return entries.size();
    }
    
    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KniffelEntry e = entries.get(rowIndex);
        return e;
    }
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
}
