/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTwitter;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Faishal
 */
public class HomeTimeline extends javax.swing.JFrame {

    /**
     * Creates new form HomeTimeline
     */
    public HomeTimeline() {
        initComponents();
    }
    public JButton getBtnCompose() {
        return btnCompose;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnFollow() {
        return btnFollow;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public void setTimeline(String s) {
        txAreaTimeline.setText(s);
    }

    public void addListener(ActionListener e) {
        btnCompose.addActionListener(e);
        btnExit.addActionListener(e);
        btnFollow.addActionListener(e);
        btnRefresh.addActionListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTimeline = new javax.swing.JTextArea();
        btnCompose = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaTimeline.setColumns(20);
        txAreaTimeline.setRows(5);
        jScrollPane1.setViewportView(txAreaTimeline);

        btnCompose.setText("Compose");

        btnFollow.setText("Follow");

        btnRefresh.setText("Refresh");

        btnExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCompose, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFollow, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompose)
                    .addComponent(btnFollow)
                    .addComponent(btnRefresh)
                    .addComponent(btnExit))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFollow;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTimeline;
    // End of variables declaration//GEN-END:variables
}