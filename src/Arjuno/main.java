/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arjuno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class main extends javax.swing.JFrame {
String nol_jam = "";
String nol_menit = "";
String nol_detik = "";
    /**
     * Creates new form main
     */
    public main() {
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

        jLabel8 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbjk = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnrst = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Jam = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btncetak1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtnama1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtjmlh = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jenis Kelamin :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 130, 90, 20);

        cbjk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - Laki", "Perempuan" }));
        jPanel1.add(cbjk);
        cbjk.setBounds(80, 150, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("No Telp:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 180, 170, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Harga per 1 hari:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 230, 110, 20);

        txttotal.setEditable(false);
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel1.add(txttotal);
        txttotal.setBounds(380, 260, 160, 30);

        btnrst.setText("RESET");
        btnrst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrstActionPerformed(evt);
            }
        });
        jPanel1.add(btnrst);
        btnrst.setBounds(520, 340, 120, 50);

        txtharga.setEditable(false);
        txtharga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtharga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtharga.setText("10000");
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtharga);
        txtharga.setBounds(80, 250, 190, 30);

        txttelp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txttelp);
        txttelp.setBounds(80, 200, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Total Harga :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 260, 90, 20);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setLayout(null);

        jButton3.setText("jButton3");
        jPanel3.add(jButton3);
        jButton3.setBounds(240, 230, 73, 23);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(60, 0, 240, 40);

        Jam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jam.setText("xx-xx-xx");
        jPanel3.add(Jam);
        Jam.setBounds(250, 20, 100, 30);

        tanggal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tanggal.setText("xx-xx-xxxx");
        jPanel3.add(tanggal);
        tanggal.setBounds(110, 20, 80, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Tanggal :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(50, 20, 70, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Pukul :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(200, 20, 70, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 330, 320, 70);

        btncetak1.setText("CETAK");
        btncetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetak1ActionPerformed(evt);
            }
        });
        jPanel1.add(btncetak1);
        btncetak1.setBounds(370, 340, 120, 50);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setText("Gunung Arjuno");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 50, 280, 70);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setText("Tiket Masuk ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 0, 280, 70);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, -10, 330, 130);

        txtnama1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnama1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama1);
        txtnama1.setBounds(80, 100, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nama :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 80, 40, 20);

        txtjmlh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtjmlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlhActionPerformed(evt);
            }
        });
        jPanel1.add(txtjmlh);
        txtjmlh.setBounds(380, 210, 110, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Jumlah Hari :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(300, 220, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Masukkan Data Diri");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 20, 270, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 400);

        setSize(new java.awt.Dimension(706, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    SetJam();
    setTanggal();
    }//GEN-LAST:event_formWindowOpened

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void btnrstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrstActionPerformed
       txttotal.setText("");
       txttelp.setText("");
       cbjk.setSelectedItem(null);
       txtjmlh.setText("");
    }//GEN-LAST:event_btnrstActionPerformed

    private void btncetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetak1ActionPerformed
    String tgl1 = tanggal.getText();
    String x = txtjmlh.getText().toString();
    String y = txtharga.getText().toString();    
    int z = Integer.parseInt(x) * Integer.parseInt(y) ;
    txttotal.setText(""+z);
    String jam1 = Jam.getText();
    String SQL = "INSERT INTO tb_transaksi (no_pelanggan,nama,jenkel,no_telp,tanggal,jam,harga) VALUES("+null+",'"+txttotal.getText()+
            "','"+cbjk.getSelectedItem()+"',"+txttelp.getText()+",'"+tgl1+"','"+jam1+"',"+txtharga.getText()+");";
    int status = db_koneksi.execute(SQL);
    if (status == 1){
        JOptionPane.showMessageDialog(this, "Data berhasil dimasukkan", "Berhasil ,We did it", JOptionPane.INFORMATION_MESSAGE);
        String nama = txtnama1.getText();
        String jenkel = cbjk.getSelectedItem().toString();
        String telp = txttelp.getText();
        String harga = txttotal.getText();        
        new tiket(nama,jenkel,telp,tgl1,jam1,harga).show();
    }else{
        JOptionPane.showMessageDialog(this, "Data gagal diproses", "Coba Lengkapi data diatas! :*", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btncetak1ActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtjmlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjmlhActionPerformed

    private void txtnama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnama1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jam;
    private javax.swing.JButton btncetak1;
    private javax.swing.JButton btnrst;
    private javax.swing.JComboBox cbjk;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjmlh;
    private javax.swing.JTextField txtnama1;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

     public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyyy");
        tanggal.setText(kal.format(skrg));
            
    }
    
    public void SetJam(){
        ActionListener taskPerformer = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Date dt = new Date();
                int n_jam = dt.getHours();
                int n_menit = dt.getMinutes();
                int n_detik = dt.getSeconds();
                if (n_jam <= 9){
                    nol_jam = "0";
                }
                if (n_menit <= 9){
                    nol_menit = "0";
                }
                if (n_detik <= 9){
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(n_jam);
                String menit = nol_menit + Integer.toString(n_menit);
                String detik = nol_detik + Integer.toString(n_detik);
                Jam.setText(jam+" : "+menit+" : "+detik);
            }
            
        };
        new Timer(100, taskPerformer).start();
        
    }

}
