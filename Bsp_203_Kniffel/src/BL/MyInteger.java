package BL;

public class MyInteger {
    private int value;
    private boolean selected;

    public MyInteger(int value, boolean selected) {
        this.value = value;
        this.selected = selected;
    }

    public int getValue() {
        return value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
