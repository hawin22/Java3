/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab1_java3_31102023;

/**
 *
 * @author Hawin
 */
public class ViDuJava extends javax.swing.JFrame {

    /**
     * Creates new form ViDuJava
     */
    public ViDuJava() {
        initComponents();
    }

    public void hienThi() {
        String tb1 = "";
        String tb2 = "";
        String tb3 = "";
        String tb = "unchecked";
        if (cbApple.isSelected()) {
            tb1 = "Apple checkbox: checked";
        } else {
            tb1 = "";
        }
        if (cbMango.isSelected()) {
            tb2 = "Mango checkbox: checked";
        } else {
            tb2 = "";
        }
        if (cbPeer.isSelected()) {
            tb3 = "Peer checkbox: checked";
        } else {
            tb3 = "";
        }
        if (cbApple.isSelected()== false && cbMango.isSelected()== false && cbPeer.isSelected()==false) {
            lbtb.setText(tb);
        }
        lbtb.setText(tb1 + "\n" + tb2 + "\n" + tb3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbApple = new javax.swing.JCheckBox();
        cbMango = new javax.swing.JCheckBox();
        cbPeer = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lbtb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cotrol in actionn: CheckBox");

        cbApple.setText("Apple");
        cbApple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAppleMouseClicked(evt);
            }
        });

        cbMango.setText("Mango");
        cbMango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMangoMouseClicked(evt);
            }
        });

        cbPeer.setText("Peer");
        cbPeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPeerMouseClicked(evt);
            }
        });

        lbtb.setText("none");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbApple, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cbMango, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(cbPeer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbtb, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbApple)
                    .addComponent(cbMango)
                    .addComponent(cbPeer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lbtb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAppleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAppleMouseClicked
        // TODO add your handling code here:
//        if (cbApple.isSelected()) {
//            lbtb.setText("Apple checkbox: checked");
//        }else{
//             lbtb.setText("");
//        }
        hienThi();
    }//GEN-LAST:event_cbAppleMouseClicked

    private void cbMangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMangoMouseClicked
        // TODO add your handling code here:
//         if (cbMango.isSelected()) {
//            lbtb.setText("Mango checkbox: checked");
//        }else{
//             lbtb.setText("");
//        }
        hienThi();
    }//GEN-LAST:event_cbMangoMouseClicked

    private void cbPeerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPeerMouseClicked
//        // TODO add your handling code here:
//         if (cbPeer.isSelected()) {
//            lbtb.setText("Peer checkbox: checked");
//        }else{
//             lbtb.setText("");
//        }
        hienThi();
    }//GEN-LAST:event_cbPeerMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViDuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViDuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViDuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViDuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViDuJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbApple;
    private javax.swing.JCheckBox cbMango;
    private javax.swing.JCheckBox cbPeer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbtb;
    // End of variables declaration//GEN-END:variables
}
