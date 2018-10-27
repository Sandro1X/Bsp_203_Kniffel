package BL;

public class KniffelEntry {

    private String name;
    private boolean selected;
    private int points;
    private int calcPoints = 0;
    private static int upperPoints;
    private static int lowerPoints;
    private static int bonus = 0;

    public KniffelEntry(String name, boolean selected, int points) {
        this.name = name;
        this.selected = selected;
        this.points = points;
    }

    public int calcPoints(int[] values) throws Exception {
        int val[] = new int[5];
        val = values;
        
        int anz = 0, value1 = 0, value2 = 0, count = 0;
        for (int i = 0; i < values.length; i++) {
            switch (points) {
                case 1:
                    if (values[i] == 1) {
                        anz++;
                    }
                    break;
                case 2:
                    if (values[i] == 2) {
                        anz++;
                    }
                    break;
                case 3:
                    if (values[i] == 3) {
                        anz++;
                    }
                    break;
                case 4:
                    if (values[i] == 4) {
                        anz++;
                    }
                    break;
                case 5:
                    if (values[i] == 5) {
                        anz++;
                    }
                    break;
                case 6:
                    if (values[i] == 6) {
                        anz++;
                    }
                    break;
            }
        }

        int n = values.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (values[j - 1] > values[j]) {
                    //swap elements  
                    temp = values[j - 1];
                    values[j - 1] = values[j];
                    values[j] = temp;
                }
            }
        }

        if (points == 25) {
            if (values[0] == values[1] && values[3] == values[4]
                    && (values[0] == values[2]) || values[4] == values[2]) {
                calcPoints = 25;
                lowerPoints += calcPoints;
                return calcPoints;
            } else {
                calcPoints = 0;
                return calcPoints;
            }
        }

        if (points == 30 || points == 40) {
            int end = values.length;
            for (int i = 0; i < end; i++) { //Removes duplicates
                for (int j = i + 1; j < end; j++) {
                    if (values[i] == values[j]) {
                        int shiftLeft = j;
                        for (int k = j + 1; k < end; k++, shiftLeft++) {
                            values[shiftLeft] = values[k];
                        }
                        end--;
                        j--;
                    }
                }
            }
            int[] whitelist = new int[end];
            for (int i = 0; i < end; i++) {
                whitelist[i] = values[i];
            }//end
            if (points == 30) {
                if (whitelist[0] == 1 || whitelist[0] == 2 || whitelist[0] == 3) {
                    if ((whitelist[1] == whitelist[0] + 1 && whitelist[2] == whitelist[1] + 1 && whitelist[3] == whitelist[2] + 1)||(
                            whitelist[1] + 1 == whitelist[2])&&whitelist[2]+1==whitelist[3]&&whitelist[3]+1==whitelist[4]) {
                        calcPoints = 30;
                        lowerPoints += calcPoints;
                        return calcPoints;
                    } else {
                        calcPoints = 0;
                        return calcPoints;
                    }
                } else {
                    calcPoints = 0;
                    return calcPoints;
                }
            }

            if (points == 40) {
                if (whitelist[0] == 1 || whitelist[0] == 2) {
                    if (whitelist[1] == whitelist[0] + 1 && whitelist[2] == whitelist[1] + 1 && whitelist[3] == whitelist[2] + 1
                            && whitelist[4] == whitelist[3] + 1) {
                        calcPoints = 40;
                        lowerPoints += calcPoints;
                        return calcPoints;
                    } else {
                        calcPoints = 0;
                        return calcPoints;
                    }
                } else {
                    calcPoints = 0;
                    return calcPoints;
                }
            }
        }
        if (points == 50) {
            value1 = values[0];
            for (int i = 0; i < values.length; i++) {
                if (values[i] != value1) {
                    calcPoints = 0;
                    return calcPoints;
                }
            }
            calcPoints = 50;
            lowerPoints += calcPoints;
            return calcPoints;
        }
        if(points == -1 || points == -2){//Wenn man 3er pasch hat kann man trzdem 4er pasch auswähln
           
            for(int i = 0; i < val.length; i++){
//                System.out.println(val[i]+" ");
                calcPoints += val[i];
            }
            int end = values.length;
            for (int i = 0; i < end; i++) { //Removes duplicates
                for (int j = i + 1; j < end; j++) {
                    if (values[i] == values[j]) {
                        int shiftLeft = j;
                        for (int k = j + 1; k < end; k++, shiftLeft++) {
                            values[shiftLeft] = values[k];
                        }
                        end--;
                        j--;
                    }
                }
            }
            int[] whitelist = new int[end];
            for (int i = 0; i < end; i++) {
                whitelist[i] = values[i];
            }//end
            
            if(whitelist.length > 3){
                calcPoints = 0;
                return calcPoints;
            }
            if(points == -2 && whitelist.length > 2){
                calcPoints = 0;
            }
            if(points == -1 && whitelist.length > 3){
                calcPoints = 0;
            }
            lowerPoints += calcPoints;
            return calcPoints;
        }

        calcPoints = anz * points;
        upperPoints += calcPoints;
        if(upperPoints >= 63){
            bonus=35;
        }
        return calcPoints;
    }

    public int getUpperPoints() {
        return upperPoints;
    }

    public int getLowerPoints() {
        return lowerPoints;
    }

    public int getBonus() {
        return bonus;
    }

    public int getCalcPoints() {
        return calcPoints;
    }

    public String getName() {
        return name;
    }

    public boolean isSelected() {
        return selected;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
