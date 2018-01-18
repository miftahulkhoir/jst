/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ann;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class Prediction extends javax.swing.JFrame {

    /**
     * Creates new form Predict
     */
    
    private DefaultTableModel tbPrediction;
    
    public Prediction() {
        initComponents();
        
        tbPrediction = new DefaultTableModel();
        
        tablePrediction.setModel(tbPrediction);
        tbPrediction.addColumn("No");
        tbPrediction.addColumn("Tahun");
        tbPrediction.addColumn("Prediksi");
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        comboAktivasi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        buttonPrediksi = new javax.swing.JButton();
        textTahun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePrediction = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prediksi");

        jPanel1.setBackground(new java.awt.Color(0, 171, 169));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PREDIKSI IPM D.I. YOGYAKARTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 171, 169));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pengaturan");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tahun");

        comboAktivasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sigmoid Biner", "Sigmoid Bipolar" }));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aktivasi");

        buttonPrediksi.setText("Prediksi");
        buttonPrediksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrediksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textTahun)
                                    .addComponent(comboAktivasi, 0, 130, Short.MAX_VALUE)))
                            .addComponent(jSeparator1)
                            .addComponent(buttonPrediksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAktivasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(buttonPrediksi)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        tablePrediction.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePrediction);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPrediksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrediksiActionPerformed
        predict();
    }//GEN-LAST:event_buttonPrediksiActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void predict() {
        String aktivasi = (String) comboAktivasi.getSelectedItem();
        int nTahun = Integer.parseInt(textTahun.getText());
        double xNorm[][] = new double[10][10];
        int tahun = 0;
        
        try {
            Statement stm = Connect.getConn().createStatement();
            ResultSet rsl = stm.executeQuery("select * from datas ORDER by tahun DESC LIMIT 0, 1");
            
            while (rsl.next()) {
                xNorm[0][0] = rsl.getDouble("t4");
                xNorm[0][1] = rsl.getDouble("t3");
                xNorm[0][2] = rsl.getDouble("t2");
                xNorm[0][3] = rsl.getDouble("t1");
                xNorm[0][4] = rsl.getDouble("target");
                tahun = rsl.getInt("tahun");
            }
            
            rsl.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Data\n"+e.toString());
        }
        
        String pilihAktivasi = "";
        
        if ("Sigmoid Biner".equals(aktivasi)) {
            pilihAktivasi = "Biner";
        } else {
            pilihAktivasi = "Bipolar";
        }
        
        Helper helper = new Helper();
        double setting[] = helper.readSetting(pilihAktivasi);
        
        double nilaiMax = setting[2];
        double nilaiMin = setting[1];
        double neuron_hidden = setting[0];
        int neuron_output = 1;
        int neuron_input = 5;
        double hasil = 0;
        double hasilNorm = 0;
        
        double x[][] = new double[10][10];
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                if ("Sigmoid Biner".equals(aktivasi)) {
                    x[i][j] = ((xNorm[i][j]-nilaiMin)*(1-0)/(nilaiMax-nilaiMin))-0;
                } else {
                    x[i][j] = ((xNorm[i][j]-nilaiMin)*(1-(-1))/(nilaiMax-nilaiMin))-1;
                }
            }
        }
        
        double v[][] = helper.readBobotHidden(neuron_hidden, neuron_input, pilihAktivasi);
        double vb[] = helper.readBiasHidden(pilihAktivasi);
        double w[][] = helper.readBobotOutput(neuron_output, neuron_hidden, pilihAktivasi);
        double wb[] = helper.readBiasOutput(pilihAktivasi);
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        for (int i = 0; i < nTahun; i++) {
            
            double z[] = new double[10];
            for (int j = 0; j < neuron_hidden; j++) {
                double z_net[] = new double[10];
                double temp = 0;
                for (int k = 0; k < neuron_input; k++) {
                    // System.out.println(v[i][j]);
                    temp = temp + (x[i][k] * v[j][k]);
                    // System.out.println(x[i][k]+" "+v[k][j]);
                }
                z_net[j] = vb[j] + temp;
                z[j] = 1/(1+(Math.exp(-z_net[j])));
            }
            
            double y[] = new double[10];
            for (int j = 0; j < neuron_output; j++) {
                double y_net[] = new double[10];
                double temp = 0;

                for (int k = 0; k < neuron_hidden; k++) {
                    temp = temp + (z[k] * w[j][k]);
                }
                y_net[j] = wb[j] + temp;
                y[j] = 1/(1+(Math.exp(-y_net[j])));
                
                // double hasil = (((y[j])*(str.nilai_max-str.nilai_min)))+(0.8*str.nilai_min);
                // hasil = (((y[j])*(77-69)))+(0.8*69);
                // hasil = (((y[j])*(nilai_max-nilai_min)))+(0.8*nilai_min);
                
                hasilNorm = y[j];
                
                // Denormalisasi bipolar
                hasil = ((nilaiMin*(1-0))+((y[j]-(0))*(nilaiMax-nilaiMin)))/(1-0);
            }
        x[0][0] = x[0][1];
        x[0][1] = x[0][2];
        x[0][2] = x[0][3];
        x[0][3] = x[0][4];
        x[0][4] = hasilNorm;
        tahun = tahun + 1;

        System.out.println(x[0][0]+" - "+x[0][1]+" - "+x[0][2]+" - "+x[0][3]+" - "+x[0][4]);
        
        Object[] obj = new Object[3];

        obj[0] = i+1;
        obj[1] = tahun;
        obj[2] = df.format(hasil);

        tbPrediction.addRow(obj);   
        }
    }
    
    private void algo(){
        double x[][] = new double[10][10];
        int y = 0;
        int tahun = 0;
        
        try {
            Statement stm = Connect.getConn().createStatement();
            ResultSet rsl = stm.executeQuery("select * from datas ORDER by tahun DESC LIMIT 0, 1");
            
            while (rsl.next()) {
                x[0][0] = rsl.getDouble("t4");
                x[0][1] = rsl.getDouble("t3");
                x[0][2] = rsl.getDouble("t2");
                x[0][3] = rsl.getDouble("t1");
                x[0][4] = rsl.getDouble("target");
                tahun = rsl.getInt("tahun");
            }
            
            rsl.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal Menampilkan Data\n"+e.toString());
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(x[0][0]+" - "+x[0][1]+" - "+x[0][2]+" - "+x[0][3]+" - "+x[0][4]);
            }
            
            x[0][0] = x[0][1];
            x[0][1] = x[0][2];
            x[0][2] = x[0][3];
            x[0][3] = x[0][4];
            x[0][4] = x[0][4] + 1;
            tahun = tahun + 1;
            
            Object[] obj = new Object[3];
                
            obj[0] = i+1;
            obj[1] = tahun;
            obj[2] = x[0][4];

            tbPrediction.addRow(obj);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prediction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prediction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrediksi;
    private javax.swing.JComboBox<String> comboAktivasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablePrediction;
    private javax.swing.JTextField textTahun;
    // End of variables declaration//GEN-END:variables
}
