/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Helper.MyMess;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author 98tae
 */
public class MainForm extends javax.swing.JFrame {

    public static LOGIN login;
    public static QLDiem qldiem;
    public static QLSV qlsv;
    public static DSSV dssv;
    public static String bien;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setTitle("Phần Mềm Quản Lý Sinh Viên");
        lbdangnhap.setText("Chưa Đăng Nhập");
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        login = new LOGIN();
        qldiem = new QLDiem();
        qlsv = new QLSV();
        dssv = new DSSV();
        bien = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangNhap = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();
        btnAbount = new javax.swing.JButton();
        btndangXuat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbdangnhap = new javax.swing.JLabel();
        lbquyen = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/dangnhap.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exitt.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAbount.setText("About");
        btnAbount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbountActionPerformed(evt);
            }
        });

        btndangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Exitt.png"))); // NOI18N
        btndangXuat.setText("Đăng Xuất");
        btndangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangXuatActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbdangnhap.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lbdangnhap.setForeground(new java.awt.Color(204, 0, 204));

        lbquyen.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbquyen.setForeground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbdangnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbdangnhap, lbquyen});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbdangnhap, lbquyen});

        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDangNhap)
                        .addGap(18, 18, 18)
                        .addComponent(btndangXuat)
                        .addGap(18, 18, 18)
                        .addComponent(btnRun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(btnAbount)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)
                        .addGap(27, 27, 27))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbount, btnExit, btndangXuat});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btndangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAbount)
                        .addComponent(btnExit))
                    .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAbount, btnDangNhap, btnExit, btndangXuat});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (bien.equals("")) {
            dangnhap();
        }else{
        MyMess.msgFalse("Vui Lòng Đăng Xuất");
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btndangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangXuatActionPerformed
        if (bien.equals("")) {
            JOptionPane.showMessageDialog(this, " vui lòng đăng nhập");
            dangnhap();
            return;
        }
        if (bien.equals("qlsv")) {
            bien = "";
            qlsv.setVisible(false);
            dangnhap();
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
        }
        if (bien.equals("qldiem")) {
            bien = "";
            qldiem.setVisible(false);
            dangnhap();
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
        }
        if (bien.equals("dssv")) {
            bien = "";
            dssv.setVisible(false);
                        dangnhap();
            JOptionPane.showMessageDialog(this, " Đăng Xuất Thành Công");
        }
        
    }//GEN-LAST:event_btndangXuatActionPerformed

    private void btnAbountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbountActionPerformed
        if (login.isVisible()) {
            login.setVisible(false);
            bien = "";
        }
        new ThongTinSV(this, true).setVisible(true);
       
    }//GEN-LAST:event_btnAbountActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        login.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        if (bien.equals("")) {
            JOptionPane.showMessageDialog(this, " vui lòng đăng nhập");
            dangnhap();
            return;
        }
        if (bien.equals("qlsv")) {
            qlsv.setVisible(true);
        }
        if (bien.equals("qldiem")) {
            qldiem.setVisible(true);
        }
        if (bien.equals("dssv")) {
            dssv.setVisible(true);
        }
    }//GEN-LAST:event_btnRunActionPerformed
   
    private void close() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void dangnhap() {
        lbdangnhap.setText("Chưa Đăng Nhập");
        lbquyen.setText("");
        if (login.isVisible()) {
            login.setVisible(false);
        }
        login.setVisible(true);

    }

    public void setquyen(String quyen) {
        lbdangnhap.setText("Đang Đăng Nhập");
        lbquyen.setText("Quyền : " + quyen);

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new MainForm().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbount;
    public javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btndangXuat;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbdangnhap;
    public static javax.swing.JLabel lbquyen;
    // End of variables declaration//GEN-END:variables
}
