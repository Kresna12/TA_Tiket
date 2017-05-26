
package Arjuno;

public class tiket extends javax.swing.JFrame {
  
    public tiket(String nama,String jenkel,String telp,String tgl1,String jam1,String harga) {
        initComponents();
        tiketnamaptg.setText(nama);
        tiketnama1.setText(nama);
        tiketjk.setText(jenkel);
        tikettelp.setText(telp);
        tikettgl.setText(tgl1);
        tiketjam.setText(jam1);
        tikettgl1.setText(tgl1);
        tiketjam1.setText(jam1);
        hargatxt.setText("Rp."+harga);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        hargatxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tiketjk = new javax.swing.JLabel();
        tiketnamaptg = new javax.swing.JLabel();
        tikettelp = new javax.swing.JLabel();
        tikettgl = new javax.swing.JLabel();
        tiketjam = new javax.swing.JLabel();
        tikettgl1 = new javax.swing.JLabel();
        tiketjam1 = new javax.swing.JLabel();
        tiketnama1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hargatxt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 130, 40, 14);

        hargatxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(hargatxt);
        hargatxt.setBounds(230, 260, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jenis Kelamin ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 160, 80, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. Telp ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 190, 60, 14);

        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 130, 4, 14);

        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 160, 4, 14);

        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 190, 4, 14);

        tiketjk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tiketjk.setText("Kosong");
        tiketjk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(tiketjk);
        tiketjk.setBounds(360, 160, 180, 14);

        tiketnamaptg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tiketnamaptg.setText("Kosong");
        getContentPane().add(tiketnamaptg);
        tiketnamaptg.setBounds(20, 110, 170, 15);

        tikettelp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tikettelp.setText("Kosong");
        getContentPane().add(tikettelp);
        tikettelp.setBounds(360, 190, 180, 14);

        tikettgl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tikettgl.setText("jLabel11");
        getContentPane().add(tikettgl);
        tikettgl.setBounds(420, 20, 110, 20);

        tiketjam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tiketjam.setText("jLabel12");
        getContentPane().add(tiketjam);
        tiketjam.setBounds(440, 40, 140, 15);

        tikettgl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(tikettgl1);
        tikettgl1.setBounds(20, 140, 130, 30);

        tiketjam1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tiketjam1.setText("jLabel12");
        getContentPane().add(tiketjam1);
        tiketjam1.setBounds(20, 180, 140, 15);

        tiketnama1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tiketnama1.setText("Kosong");
        getContentPane().add(tiketnama1);
        tiketnama1.setBounds(360, 130, 180, 14);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arjuno/tiket.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -10, 560, 360);

        hargatxt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(hargatxt1);
        hargatxt1.setBounds(260, 250, 130, 30);

        setSize(new java.awt.Dimension(574, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiket(null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hargatxt;
    private javax.swing.JLabel hargatxt1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel tiketjam;
    private javax.swing.JLabel tiketjam1;
    private javax.swing.JLabel tiketjk;
    private javax.swing.JLabel tiketnama1;
    private javax.swing.JLabel tiketnamaptg;
    private javax.swing.JLabel tikettelp;
    private javax.swing.JLabel tikettgl;
    private javax.swing.JLabel tikettgl1;
    // End of variables declaration//GEN-END:variables
}
