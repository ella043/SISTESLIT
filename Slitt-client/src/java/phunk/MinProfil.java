/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phunk;

/**
 *
 * @author Fredrik
 */
public class MinProfil extends javax.swing.JFrame {

    /**
     * Creates new form MinProfil
     */
    public MinProfil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Fremgang = new javax.swing.JLabel();
        Innlevering = new javax.swing.JLabel();
        Modul = new javax.swing.JLabel();
        Kalender = new javax.swing.JLabel();
        Tilbakemelding = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        Bakgrunn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fremgang.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        Fremgang.setForeground(new java.awt.Color(255, 255, 255));
        Fremgang.setText("Fremgang");
        Fremgang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FremgangMouseClicked(evt);
            }
        });

        Innlevering.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        Innlevering.setForeground(new java.awt.Color(255, 255, 255));
        Innlevering.setText("Innlevering");
        Innlevering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InnleveringMouseClicked(evt);
            }
        });

        Modul.setFont(new java.awt.Font("Arial", 0, 72)); // NOI18N
        Modul.setForeground(new java.awt.Color(255, 255, 255));
        Modul.setText("Modul");
        Modul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModulMouseClicked(evt);
            }
        });

        Kalender.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        Kalender.setForeground(new java.awt.Color(255, 255, 255));
        Kalender.setText("Kalender");
        Kalender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KalenderMouseClicked(evt);
            }
        });

        Tilbakemelding.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        Tilbakemelding.setForeground(new java.awt.Color(255, 255, 255));
        Tilbakemelding.setText("Tilbakemelding");
        Tilbakemelding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TilbakemeldingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(745, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(Modul)
                        .addGap(44, 44, 44)
                        .addComponent(Kalender, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(Tilbakemelding)
                        .addGap(239, 239, 239))))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(361, Short.MAX_VALUE)
                    .addComponent(Fremgang, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1062, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(562, Short.MAX_VALUE)
                    .addComponent(Innlevering)
                    .addContainerGap(873, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(Modul, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kalender, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Tilbakemelding)
                .addGap(285, 285, 285))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(348, Short.MAX_VALUE)
                    .addComponent(Fremgang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(412, Short.MAX_VALUE)
                    .addComponent(Innlevering, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(Fremgang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Innlevering, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Modul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Kalender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tilbakemelding, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Bakgrunn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Min profil.png"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(Bakgrunn)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(Bakgrunn, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2.setLayer(Bakgrunn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TilbakemeldingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TilbakemeldingMouseClicked
    Tilbakemelding tbm=new Tilbakemelding();
   MinProfil.this.setVisible(false);
   tbm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TilbakemeldingMouseClicked

    private void FremgangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FremgangMouseClicked
        Framgang fgang=new Framgang();
        MinProfil.this.setVisible(false);
        fgang.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_FremgangMouseClicked

    private void InnleveringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InnleveringMouseClicked
            InnleveringFREAK delivery=new InnleveringFREAK();
            MinProfil.this.setVisible(false);
            delivery.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_InnleveringMouseClicked

    private void ModulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModulMouseClicked
        Modul modul=new Modul();
            MinProfil.this.setVisible(false);
            modul.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ModulMouseClicked

    private void KalenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KalenderMouseClicked
        Kalender dato=new Kalender();
            MinProfil.this.setVisible(false);
            dato.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_KalenderMouseClicked

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
            java.util.logging.Logger.getLogger(MinProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bakgrunn;
    private javax.swing.JLabel Fremgang;
    private javax.swing.JLabel Innlevering;
    private javax.swing.JLabel Kalender;
    private javax.swing.JLabel Modul;
    private javax.swing.JLabel Tilbakemelding;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
