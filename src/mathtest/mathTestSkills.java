/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class mathTestSkills extends javax.swing.JFrame {
    int callquestions;
    
    public void init(){
        callquestions = 0;
    }
   
    public mathTestSkills() {
        initComponents();
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 700));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathtest/image/Picture0.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathtest/image/jpgePeople.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathtest/image/jpgePhone.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathtest/image/jpge50.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathtest/image/IQtest.PNG"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 4, true));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 4, true));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 4, true));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 4, true));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jTextField5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jTextField3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))))
                .addComponent(jLabel1)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(143, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int count = 0;
    String[] imagenames = {"Picture0.png"};
    int people = 0;
    String [] impeople = {"jpgePeopleX.jpg"};
    int phone = 0;
    String [] imagephone = {"jpgePhoneX.jpg"};
    int fifty50 = 0;
    String [] imagefifty50 = {"jpge50X.jpg"};
    int correct0 = 0;
    String [] imagecorrect0 = {"Picture0.png"};
    int correct1 = 0;
    String [] imagecorrect1 = {"Picture01.png"};
    int correct2 = 0;
    String [] imagecorrect2 = {"Picture02.png"};
    int correct3 = 0;
    String [] imagecorrect3 = {"Picture03.png"};
    int correct4 = 0;
    String [] imagecorrect4 = {"Picture4.png"};
    int correct5 = 0;
    String [] imagecorrect5 = {"Picture5.png"};
    int correct6 = 0;
    String [] imagecorrect6 = {"Picture6.png"};
    int correct7 = 0;
    String [] imagecorrect7 = {"Picture7.png"};
    int correct8 = 0;
    String [] imagecorrect8 = {"Picture8.png"};
    int correct9 = 0;
    String [] imagecorrect9 = {"Picture9.png"};
    int correct10 = 0;
    String [] imagecorrect10 = {"Picture10.png"};
    int correct11 = 0;
    String [] imagecorrect11 = {"Picture11.png"};
    int correct12 = 0;
    String [] imagecorrect12 = {"Picture12.png"};
    int correct13 = 0;
    String [] imagecorrect13 = {"Picture13.png"};
    int correct14 = 0;
    String [] imagecorrect14 = {"Picture14.png"};
    int correct15 = 0;
    String [] imagecorrect15 = {"Picture15.png"};
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
       this.getContentPane().setBackground(Color.BLACK);
    }//GEN-LAST:event_formMouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

       jTextField1.setText("Test Your Skill, Get Dollar");
       jTextField2.setText("                      ");
       jTextField3.setText("                      ");
       jTextField4.setText("                      ");
       jTextField5.setText("                      ");
    }//GEN-LAST:event_formWindowActivated

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        callquestions = callquestions + 1;
        
        jTextField1.setForeground(Color.WHITE);
        jTextField2.setForeground(Color.WHITE);
        jTextField3.setForeground(Color.WHITE);
        jTextField4.setForeground(Color.WHITE);
        jTextField5.setForeground(Color.WHITE);
        
        if(callquestions == 1)
        {
            jTextField1.setText("What is 9*4");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
            
        }
        if(callquestions == 2){
            jTextField1.setText("What is 2+16+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
        if(callquestions == 3){
            jTextField1.setText("What is 10+15+20");
            jTextField2.setText(" A) 67 ");
            jTextField3.setText(" B) 36 ");
            jTextField4.setText(" C) 18 ");
            jTextField5.setText(" D) 45 ");
        }
        if(callquestions == 4){
            jTextField1.setText("What is 4+1+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 23 ");
            jTextField5.setText(" D) 67 ");
        }
        if(callquestions == 5){
            jTextField1.setText("What is 5*2+8");
            jTextField2.setText(" A) 50 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
         if(callquestions == 6){
            jTextField1.setText("What is 6+2+100");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 108 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
          if(callquestions == 7){
            jTextField1.setText("What is 8+22+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 38 ");
            jTextField5.setText(" D) 48 ");
        }
           if(callquestions == 8){
            jTextField1.setText("What is 8+20+10");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 38 ");
        }
            if(callquestions == 9){
            jTextField1.setText("What is 9+9+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
             if(callquestions == 10){
            jTextField1.setText("What is 10+2+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 30 ");
        }
         if(callquestions == 11){
            jTextField1.setText("What is 11+4+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 33 ");
            jTextField5.setText(" D) 67 ");
        }
          if(callquestions == 12){
            jTextField1.setText("What is 12+4+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 34 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
           if(callquestions == 13){
            jTextField1.setText("What is 13+15+2");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 30 ");
        }
            if(callquestions == 14){
            jTextField1.setText("What is 14+2+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 34 ");
            jTextField5.setText(" D) 67 ");
        }
             if(callquestions == 15){
            jTextField1.setText("What is 15+3+18");
            jTextField2.setText(" A) 36 ");
            jTextField3.setText(" B) 18 ");
            jTextField4.setText(" C) 45 ");
            jTextField5.setText(" D) 67 ");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ImageIcon [] imagelist1 = new ImageIcon[1];
        for (int i = 0; i < imagelist1.length; i++) {
            imagelist1 [i] = new ImageIcon(getClass().getResource("/mathtest/image/"+impeople[i]));
        }
        if(people < 0) people = 1;
        if(people >=0 && people < impeople.length){
            jLabel2.setIcon(imagelist1[people]);
            
            people++;
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon [] imagelist1 = new ImageIcon[1];
        for (int i = 0; i < imagelist1.length; i++) {
            imagelist1 [i] = new ImageIcon(getClass().getResource("/mathtest/image/"+imagephone[i]));
        }
        if(phone < 0) phone = 1;
        if(phone >=0 && phone < imagephone.length){
            jLabel3.setIcon(imagelist1[phone]);
            
            phone++;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ImageIcon [] imagelist1 = new ImageIcon[1];
        for (int i = 0; i < imagelist1.length; i++) {
            imagelist1[i] = new ImageIcon(getClass().getResource("mathtest/image/"+imagefifty50));
        }
        if(fifty50 < 0) fifty50 = 1;
        if(fifty50 >= 0 && fifty50 < imagefifty50.length){
            jLabel4.setIcon(imagelist1[fifty50]);
            fifty50++;
//        }
//        if(callquestions == 1 && jLabel4.isFocusable() || (callquestions == 2
//                && jLabel4.isFocusable())){
//            jTextField3.setForeground(Color.BLACK);
//            jTextField5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if(callquestions == 1 && jTextField2.isFocusable()){
            jTextField2.setOpaque(true);
            jTextField2.setForeground(Color.WHITE);
            jTextField2.setBackground(Color.BLACK);
            
            jTextField3.setOpaque(true);
            jTextField3.setForeground(Color.BLACK);
            jTextField3.setBackground(Color.GREEN);
            
            jTextField4.setOpaque(true);
            jTextField4.setForeground(Color.WHITE);
            jTextField4.setBackground(Color.BLACK);
            
            jTextField5.setOpaque(true);
            jTextField5.setForeground(Color.WHITE);
            jTextField5.setBackground(Color.BLACK);
            
            ImageIcon [] imagelist1 = new ImageIcon [1];
            for (int i = 0; i <imagelist1.length; i++) {
                imagelist1[i] =new ImageIcon(getClass().getResource("mathtest/image/"+imagecorrect1[i]));
                if(correct1 < 0) correct1 = 1;
                if(correct1 >= 0 && correct1 < imagecorrect1.length){
                    jLabel1.setIcon(imagelist1[correct1]);
                    
                    correct1++;
                }
            }
            
            
        }
    }//GEN-LAST:event_jTextField2MouseClicked

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
            java.util.logging.Logger.getLogger(mathTestSkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathTestSkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathTestSkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathTestSkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mathTestSkills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
