package BL;

public class KniffelValue {

    private int[] rolledValues = new int [5];

    public KniffelValue() {
    }

    public int[] getRolledValues() {
        return rolledValues;
    }

    public void setRolledValues(int[] rolledValues) {
        this.rolledValues = rolledValues;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < rolledValues.length;i++){
            sb.append(rolledValues[i]+"");
        }
        return sb.toString(); //TODO
    }
}