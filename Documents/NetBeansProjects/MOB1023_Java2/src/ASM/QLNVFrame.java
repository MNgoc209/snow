package ASM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLNVFrame extends javax.swing.JFrame {

    private String filename = "Employee.txt";
    private INhanvien serv;
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
    public ArrayList<Nhanvien> list = new ArrayList<>();

    public QLNVFrame() {
        initComponents();
        this.serv = new NVService();

        Nhanvien nv1 = new Nhanvien("Nv1", "Minh Ngọc", 20, "ngocnmph@fpt.edu.vn", 3000);
        Nhanvien nv2 = new Nhanvien("Nv2", "Hoàng Đức", 20, "duclqhph@fpt.edu.vn", 4000);
        this.serv.insert(nv1);
        this.serv.insert(nv2);
        
        this.dongHo();
        this.loadTable();
    }

    private void loadTable() {
        ArrayList<Nhanvien> list = this.serv.select();
        DefaultTableModel dtm = (DefaultTableModel) this.tblQLNV.getModel();
        dtm.setRowCount(0);
        for (Nhanvien nv : list) {
            Object[] rowData = {
                nv.getMa(),
                nv.getHoTen(),
                nv.getTuoi(),
                nv.getEmail(),
                nv.getLuong()};
            dtm.addRow(rowData);
        }
    }

    public void dongHo() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    Calendar calendar = new GregorianCalendar();
                    int gio = calendar.get(Calendar.HOUR);
                    int phut = calendar.get(Calendar.MINUTE);
                    int AM_PM = calendar.get(Calendar.AM_PM);
                    String day_night;
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String t = gio + ":" + phut + " " + day_night;
                    lblTime.setText(t);
                }
            }
        }.start();
    }

    public String STT(int row) {
        return "Record: " + (row + 1) + " of " + list.size();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnNe = new javax.swing.JButton();
        bntSa = new javax.swing.JButton();
        bntDe = new javax.swing.JButton();
        btnFi = new javax.swing.JButton();
        btnOp = new javax.swing.JButton();
        btnEx = new javax.swing.JButton();
        btnNho = new javax.swing.JButton();
        bntNhonho = new javax.swing.JButton();
        btnLonlon = new javax.swing.JButton();
        btnLon = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 0));
        lblTime.setText("00:00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MÃ NHÂN VIÊN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("HỌ VÀ TÊN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TUỔI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("EMAIL");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("LƯƠNG");

        txtMa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNe.setText("NEW");
        btnNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeActionPerformed(evt);
            }
        });

        bntSa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntSa.setText("SAVE");
        bntSa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSaActionPerformed(evt);
            }
        });

        bntDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntDe.setText("DELETE");
        bntDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeActionPerformed(evt);
            }
        });

        btnFi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFi.setText("FIND");
        btnFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiActionPerformed(evt);
            }
        });

        btnOp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOp.setText("OPEN");
        btnOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpActionPerformed(evt);
            }
        });

        btnEx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEx.setText("EXIT");
        btnEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntSa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(bntDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNe)
                .addGap(18, 18, 18)
                .addComponent(bntSa)
                .addGap(18, 18, 18)
                .addComponent(bntDe)
                .addGap(18, 18, 18)
                .addComponent(btnFi)
                .addGap(18, 18, 18)
                .addComponent(btnOp)
                .addGap(18, 18, 18)
                .addComponent(btnEx)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNho.setText("|<");

        bntNhonho.setText("<<");

        btnLonlon.setText(">>");

        btnLon.setText(">|");

        lblRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(255, 51, 0));
        lblRecord.setText("Record");

        tblQLNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntNhonho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLonlon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLon)
                        .addGap(18, 18, 18)
                        .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNho)
                            .addComponent(bntNhonho)
                            .addComponent(btnLonlon)
                            .addComponent(btnLon)
                            .addComponent(lblRecord)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeActionPerformed
        this.clear();
    }//GEN-LAST:event_btnNeActionPerformed

    private void bntSaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSaActionPerformed
        int row = this.tblQLNV.getSelectedRow();
        if (row == -1) {
            Nhanvien nv = this.getFrom();
            if (nv == null) {
                return;
            }
            this.serv.insert(nv);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            this.loadTable();
            this.clear();
        } else {
            Nhanvien nv = this.getFrom();
            if (nv == null) {
                return;
            }
            this.serv.update(row, nv);
            JOptionPane.showMessageDialog(this, "Cập nhập thành công");
            this.loadTable();
            this.clear();
        }
    }//GEN-LAST:event_bntSaActionPerformed

    private void bntDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeActionPerformed
        int row = this.tblQLNV.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng để xóa");
            return;
        }
        this.serv.delete(row);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_bntDeActionPerformed

    private void btnFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiActionPerformed

    private void btnOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpActionPerformed
        File f = new File(filename);
        if (f.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Nhanvien> ds = (ArrayList< Nhanvien>) ois.readObject();
            ois.close();
            JOptionPane.showMessageDialog(this, "Đọc file thành công");
            this.serv.setList(ds);
            this.loadTable();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi luồng đọc");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi luồng đọc");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnOpActionPerformed

    private void btnExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExActionPerformed
        File f = new File(filename);
        if (f.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            ArrayList<Nhanvien> ds = this.serv.select();
            oos.writeObject(ds);

            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi file thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi luồng ghi");
            e.printStackTrace();
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_btnExActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        int row = this.tblQLNV.getSelectedRow();
        txtMa.setText(tblQLNV.getValueAt(row, 0).toString());
        txtHoTen.setText(tblQLNV.getValueAt(row, 1).toString());
        txtTuoi.setText(tblQLNV.getValueAt(row, 2).toString());
        txtEmail.setText(tblQLNV.getValueAt(row, 3).toString());
        txtLuong.setText(tblQLNV.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void clear() {
        txtMa.setText("");
        txtHoTen.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
    }

    private Nhanvien getFrom() {
        String ma = this.txtMa.getText();
        String hoTen = this.txtHoTen.getText();
        String tuoiStr = this.txtTuoi.getText();
        String email = this.txtEmail.getText();
        String luongStr = this.txtLuong.getText();

        int tuoi = Integer.parseInt(tuoiStr);
        double luong = Double.parseDouble(luongStr);

        if (ma.trim().equals("") || hoTen.trim().equals("") || tuoiStr.trim().equals("") || email.trim().equals("") || luongStr.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        } else if (tuoi < 16 || tuoi > 55) {
            JOptionPane.showMessageDialog(this, "Tuổi phải từ 16 - 55");
            return null;
        } else if (luong < 5000) {
            JOptionPane.showMessageDialog(this, "Lương phải trên 5 triệu");
            return null;
        } else {
            Matcher matcher = Pattern.compile(P_EMAIL).matcher(txtEmail.getText());
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "email sai định dạng");
                return null;
            }
        }
        Nhanvien nv = new Nhanvien(ma, hoTen, tuoi, email, luong);
        return nv;
    }

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
            java.util.logging.Logger.getLogger(QLNVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNVFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDe;
    private javax.swing.JButton bntNhonho;
    private javax.swing.JButton bntSa;
    private javax.swing.JButton btnEx;
    private javax.swing.JButton btnFi;
    private javax.swing.JButton btnLon;
    private javax.swing.JButton btnLonlon;
    private javax.swing.JButton btnNe;
    private javax.swing.JButton btnNho;
    private javax.swing.JButton btnOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
