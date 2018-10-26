package GUI;

import BL.KniffelEntry;
import BL.KniffelTableModel;
import BL.KniffelTableRenderer;
import BL.MyInteger;
import Dice.DiceTableModel;
import Dice.DiceTableRenderer;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KniffelGUI extends javax.swing.JFrame {

    private KniffelTableModel model = new KniffelTableModel();
    private DiceTableModel diceModel = new DiceTableModel();
    private KniffelTableRenderer rend = new KniffelTableRenderer();
    private DiceTableRenderer diceRend = new DiceTableRenderer();
    private int count = 0;
    private Random rand = new Random();
    private int idx;

    public KniffelGUI() {
        initComponents();
        jtCard.setModel(model);
        jtCard.setDefaultRenderer(Object.class, rend);
        jtCard.setShowGrid(true);
        
        btRoll.setBackground(Color.black);
        btRoll.setForeground(Color.white);
        
        model.add(new KniffelEntry("Nur Einser", false, 1));//Done
        model.add(new KniffelEntry("Nur Zweier", false, 2));//Done
        model.add(new KniffelEntry("Nur Dreier", false, 3));//Done
        model.add(new KniffelEntry("Nur Vierer", false, 4));//Done
        model.add(new KniffelEntry("Nur Fünfer", false, 5));//Done
        model.add(new KniffelEntry("Nur Sechser", false, 6));//Done
        model.add(new KniffelEntry("Pasch 3", false, -1));
        model.add(new KniffelEntry("Pasch 4", false, -2));
        model.add(new KniffelEntry("Full House", false, 25));//Done
        model.add(new KniffelEntry("Kleine Straße", false, 30));//Done
        model.add(new KniffelEntry("Große Straße", false, 40));//Done
        model.add(new KniffelEntry("Kniffel", false, 50));

        diceModel.add(new MyInteger(rand.nextInt(6), false));
        diceModel.add(new MyInteger(rand.nextInt(6), false));
        diceModel.add(new MyInteger(rand.nextInt(6), false));
        diceModel.add(new MyInteger(rand.nextInt(6), false));
        diceModel.add(new MyInteger(rand.nextInt(6), false));
        
        jtDice.setModel(new DefaultTableModel());
        jtDice.setRowHeight(120);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDice = new javax.swing.JTable();
        btRoll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCard = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUpperSum = new javax.swing.JTextField();
        tfBonus = new javax.swing.JTextField();
        tfLowerSum = new javax.swing.JTextField();
        tfSum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jtDice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDice);

        btRoll.setText("Würfeln");
        btRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRollActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gewinnkarte"));

        jtCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCardMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCard);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Punkte"));

        jLabel1.setText("Obere Summe:");

        jLabel2.setText("Oberer Bonus:");

        jLabel3.setText("Untere Summe:");

        jLabel4.setText("Gesamt-Punkte");

        tfUpperSum.setEditable(false);
        tfUpperSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUpperSum.setText("0");

        tfBonus.setEditable(false);
        tfBonus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBonus.setText("0");

        tfLowerSum.setEditable(false);
        tfLowerSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLowerSum.setText("0");

        tfSum.setEditable(false);
        tfSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSum.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(tfLowerSum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBonus)
                    .addComponent(tfUpperSum, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUpperSum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLowerSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btRoll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCardMouseClicked
        if(count == 3){ //You can only choose if you rolled 3 times.
            idx = jtCard.getSelectedRow(); //Gets selected index
            try {
                model.selectCb(idx); //Selects cb
                model.getEntry(idx).calcPoints(diceRend.getValues()); //Calculates the points, so the renderer can show it.
                tfUpperSum.setText(model.getEntry(idx).getUpperPoints()+"");
                tfLowerSum.setText(model.getEntry(idx).getLowerPoints()+"");
                tfBonus.setText(model.getEntry(idx).getBonus()+"");
                tfSum.setText(model.getEntry(idx).getUpperPoints()+model.getEntry(idx).getLowerPoints()
                +model.getEntry(idx).getBonus()+"");
                jtDice.setModel(new DefaultTableModel()); //Removes the model, so the dices aren't shown any more
            for(MyInteger mi : diceModel.getDice()){ //Removes all the selections (red background)
                mi.setSelected(false);
            }
            count = 0; //0, so you can roll one more time
            
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jtCardMouseClicked

    private void jtDiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDiceMouseClicked
        diceModel.changeState(jtDice.getSelectedColumn()); //Selects dice
    }//GEN-LAST:event_jtDiceMouseClicked

    private void btRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRollActionPerformed
        jtDice .setModel(diceModel);
        jtDice.setDefaultRenderer(Object.class, diceRend);
        if (count < 3) { //You can only roll 3 times, then you have to select your value
            for (int i = 4; i >= 0; i--) { //Creates random numbers to roll the dices again
                if (!diceModel.getDice().get(i).isSelected()) { //But only for those which aren't selected
                    diceModel.delete(i); //Removes the old one
                    diceModel.getDice().add(i, new MyInteger(rand.nextInt(6), false)); //And creates a random one between 1 and 6 
                }
            }
            diceModel.fireTableDataChanged();
            count ++;
            if(count == 3){
                for(MyInteger mi : diceModel.getDice()){ //Removes all the selections (red background)
                mi.setSelected(false);
            }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Du hast schon 3 Mal gewürfelt!");
        }
//        System.out.println(diceRend.getValues()[0]+""+diceRend.getValues()[1]
//        +""+diceRend.getValues()[2]+""+diceRend.getValues()[3]+""+diceRend.getValues()[4]); //TODO
    }//GEN-LAST:event_btRollActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KniffelGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCard;
    private javax.swing.JTable jtDice;
    private javax.swing.JTextField tfBonus;
    private javax.swing.JTextField tfLowerSum;
    private javax.swing.JTextField tfSum;
    private javax.swing.JTextField tfUpperSum;
    // End of variables declaration//GEN-END:variables

}
