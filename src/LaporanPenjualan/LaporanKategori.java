/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaporanPenjualan;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author LENOVO
 */
public class LaporanKategori extends javax.swing.JInternalFrame {
    
    Connection conn = (Connection)koneksi.configDB();
    JasperReport JR;
    JasperPrint JP;
    Map<String, Object> param = new HashMap<String, Object >(2);
    JasperDesign JD;

    /**
     * Creates new form LaporanOmset
     */
    public LaporanKategori() {
        initComponents();
        tampilComboKategori();
        
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jTextFieldKategori = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();

        setTitle("Laporan Omset ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Tampilkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tgl Mulai");

        jLabel2.setText("Tgl Akhiri");

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxKategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxKategoriItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jTextFieldKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int Pilihan = JOptionPane.showConfirmDialog(null, "Tampilkan Laporan Kategori", "PERINGATAN !",JOptionPane.YES_OPTION);
        if(Pilihan==JOptionPane.YES_OPTION){
        try {
            File jasper = new File("src/LaporanPenjualan/LaporanKategori.jrxml");
            JasperDesign JD = JRXmlLoader.load(jasper);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = String.valueOf(sdf.format(jDateChooser1.getDate()));
            String tanggal2 = String.valueOf(sdf.format(jDateChooser2.getDate()));
            String namaKategori = jComboBoxKategori.getSelectedItem().toString();
            String kodeKategori = jTextFieldKategori.getText();
             
            param.put("Tanggal", tanggal);
            param.put("TanggalAkhir", tanggal2);
            param.put("NamaKategori", namaKategori);
            param.put("KodeKategori", kodeKategori);
            
            JR = JasperCompileManager.compileReport(JD);
            JP = JasperFillManager.fillReport(JR, param,conn);
//            Muncul preview Report
//            JasperViewer.viewReport(JP, false);
//            Langsung print
//           JasperPrintManager.printReport(JP, false);
//             Tampil di scrollPane
            JRViewer jv = new JRViewer(JP);
            jv.setOpaque(true);
            jv.setVisible(true);
            
            jScrollPane1.add(jv);
            jScrollPane1.setViewportView(jv);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
        }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxKategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxKategoriItemStateChanged
        // TODO add your handling code here:
        try {
            if(jComboBoxKategori.getSelectedIndex()==0){
                jTextFieldKategori.setText("");
            }else{
                String namaKategori = jComboBoxKategori.getSelectedItem().toString();
                String query = "select kdKategori from tabelKategori where namaKategori = '"+namaKategori+"'";

                try {
                    Statement stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery(query);

                    if(rs.next()){
                        jTextFieldKategori.setText(rs.getString("kdKategori"));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jComboBoxKategoriItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldKategori;
    // End of variables declaration//GEN-END:variables

    private void tampilComboKategori() {
       jComboBoxKategori.removeAllItems();
         jComboBoxKategori.addItem("Pilih Kategori");
       
         String query = "select namaKategori from tabelkategori order by namakategori asc";
         try {
            Statement stm=conn.createStatement();
            ResultSet res=stm.executeQuery(query);
             while (res.next()) {                 
                 jComboBoxKategori.addItem(res.getString("namaKategori"));
             }
             res.last();
             int jumlahData = res.getRow();
             res.first();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
