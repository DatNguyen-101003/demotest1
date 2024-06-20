/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
/**
 *
 * @author vhung
 */
import DAO.DAO_TacGia;
import Model.Model_TacGia;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GUI_Home extends javax.swing.JFrame {
    ArrayList<Model_TacGia> danhsachTacGia;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    

    private static void setSelectedIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form Home
     */
    public GUI_Home() {
        initComponents();
        loadbangtacgia();
        
        TableHienThi.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Lấy chỉ số hàng được chọn
        int selectedRow = TableHienThi.getSelectedRow();
        
        // Lấy dữ liệu từ hàng được chọn và hiển thị lên các JTextField
        txt_maTacGia.setText(TableHienThi.getValueAt(selectedRow, 0).toString());
        txt_tenTacGia.setText(TableHienThi.getValueAt(selectedRow, 1).toString());
        txt_namSinh.setText(TableHienThi.getValueAt(selectedRow, 2).toString());
        txt_namMat.setText(TableHienThi.getValueAt(selectedRow, 3).toString());
        txt_quocTich.setText(TableHienThi.getValueAt(selectedRow, 4).toString());
    }
});

    }
    
    
    private void loadbangtacgia() {
        
    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true; // Cho phép chỉnh sửa ô
        }
    };

    Object[] title = {"Mã tác giả", "Tên tác giả", "Năm sinh", "Năm mất", "Quốc tịch"};
    model.setColumnIdentifiers(title);

    danhsachTacGia = new DAO.DAO_TacGia().layDanhSachTacGia();
    for (Model_TacGia tg : danhsachTacGia) {
        Object[] row = {tg.getMaTacGia(), tg.getTenTacGia(), tg.getNamSinh(), tg.getNamMat(), tg.getQuocTich()};
        model.addRow(row);    
    }
    
    TableHienThi.setModel(model);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        tbTrangchu = new javax.swing.JTabbedPane();
        QL_Sach = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        QL_TacGia = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHienThi = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_maTacGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tenTacGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_namSinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_namMat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_quocTich = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        them_txt_quocTich = new javax.swing.JTextField();
        them_txt_tenTacGia = new javax.swing.JTextField();
        them_txt_namSinh = new javax.swing.JTextField();
        them_txt_namMat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_QuanLyTacGia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout QL_SachLayout = new javax.swing.GroupLayout(QL_Sach);
        QL_Sach.setLayout(QL_SachLayout);
        QL_SachLayout.setHorizontalGroup(
            QL_SachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_SachLayout.createSequentialGroup()
                .addGroup(QL_SachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QL_SachLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QL_SachLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(521, Short.MAX_VALUE))
        );
        QL_SachLayout.setVerticalGroup(
            QL_SachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_SachLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(685, Short.MAX_VALUE))
        );

        tbTrangchu.addTab("Quản lý sách", QL_Sach);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        TableHienThi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableHienThi);

        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 2));

        jLabel3.setText("Mã tác giả");
        jPanel1.add(jLabel3);

        txt_maTacGia.setEditable(false);
        txt_maTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maTacGiaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_maTacGia);

        jLabel4.setText("Tên tác giả");
        jPanel1.add(jLabel4);
        jPanel1.add(txt_tenTacGia);

        jLabel5.setText("Năm sinh");
        jPanel1.add(jLabel5);
        jPanel1.add(txt_namSinh);

        jLabel6.setText("Năm mất");
        jPanel1.add(jLabel6);
        jPanel1.add(txt_namMat);

        jLabel7.setText("Quốc tịch");
        jPanel1.add(jLabel7);
        jPanel1.add(txt_quocTich);

        jLabel9.setText("Quốc tịch");

        jLabel10.setText("Năm mất");

        jLabel11.setText("Năm sinh");

        jLabel12.setText("Tên tác giả");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(them_txt_namMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(them_txt_namSinh, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(them_txt_tenTacGia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(them_txt_quocTich))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them_txt_tenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them_txt_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them_txt_namMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them_txt_quocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QL_TacGiaLayout = new javax.swing.GroupLayout(QL_TacGia);
        QL_TacGia.setLayout(QL_TacGiaLayout);
        QL_TacGiaLayout.setHorizontalGroup(
            QL_TacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_TacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(QL_TacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(QL_TacGiaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        QL_TacGiaLayout.setVerticalGroup(
            QL_TacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QL_TacGiaLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(QL_TacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QL_TacGiaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbTrangchu.addTab("tab2", QL_TacGia);

        getContentPane().add(tbTrangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, -36, 930, 840));

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        btn_QuanLyTacGia.setText("Quản lý tác giả");
        btn_QuanLyTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuanLyTacGiaMouseClicked(evt);
            }
        });
        btn_QuanLyTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuanLyTacGiaActionPerformed(evt);
            }
        });
        jPanel6.add(btn_QuanLyTacGia);

        jButton3.setText("Quản lý nhà xuất bản");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel6.add(jButton3);

        jButton6.setText("Quản lý sách");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel6.add(jButton6);

        jButton4.setText("Quản lý mượn");
        jPanel6.add(jButton4);

        jButton5.setText("Danh sách đặt sách");
        jPanel6.add(jButton5);

        jButton2.setText("Danh sách phạt");
        jPanel6.add(jButton2);

        jButton7.setText("Quản lý tài khoản");
        jPanel6.add(jButton7);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, 180, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QuanLyTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuanLyTacGiaMouseClicked
            int index = tbTrangchu.indexOfComponent(QL_TacGia);
            tbTrangchu.setSelectedIndex(index);// TODO add your handling code here:
    }//GEN-LAST:event_btn_QuanLyTacGiaMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
            int index = tbTrangchu.indexOfComponent(QL_Sach);
            tbTrangchu.setSelectedIndex(index);       
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
//        
//       // Khởi tạo form Hienthi
//    Hienthi hienthiForm = new Hienthi();
//    
//    // Hiển thị form Hienthi
//    hienthiForm.setVisible(true);
//    
//    // Chuyển JTabbedPane sang tab chứa form Hienthi
//    int index = tbTrangchu.indexOfComponent(hienthiForm);
//    if (index != -1) {
//        tbTrangchu.setSelectedIndex(index);
//    }
//      
    }//GEN-LAST:event_jButton3MouseClicked

    private void btn_QuanLyTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuanLyTacGiaActionPerformed
         int index = tbTrangchu.indexOfComponent(QL_TacGia);
            tbTrangchu.setSelectedIndex(index);//    
    }//GEN-LAST:event_btn_QuanLyTacGiaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
        // Giả sử bạn có các JTextField cho các trường dữ liệu tương ứng

        String tenTacGia = them_txt_tenTacGia.getText();
        int namSinh = Integer.parseInt(them_txt_namSinh.getText());
        int namMat = Integer.parseInt(them_txt_namMat.getText());
        String quocTich = them_txt_quocTich.getText();

        Model_TacGia tg = new Model_TacGia();
        tg.setTenTacGia(tenTacGia);
        tg.setNamSinh(namSinh);
        tg.setNamMat(namMat);
        tg.setQuocTich(quocTich);

        DAO_TacGia dao = new DAO_TacGia();
        boolean isInserted = dao.insertTacGia(tg);
        
        // Trả về rỗng
        them_txt_tenTacGia.setText(""); 
        them_txt_namSinh.setText(""); 
        them_txt_namMat.setText(""); 
        them_txt_quocTich.setText(""); 
        
        if (isInserted) {
            JOptionPane.showMessageDialog(this, "Thêm tác giả thành công!");
            // Cập nhật lại bảng hiển thị nếu cần thiết
            loadbangtacgia();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm tác giả thất bại!");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txt_maTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maTacGiaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
           int selectedRow = TableHienThi.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Lấy thông tin từ hàng được chọn
            int maTacGia = (int) TableHienThi.getValueAt(selectedRow, 0);
            String tenTacGia = (String) TableHienThi.getValueAt(selectedRow, 1); // Ví dụ lấy tên tác giả để hiển thị trong hộp thoại xác nhận

            // Hiển thị hộp thoại xác nhận
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa tác giả \"" + tenTacGia + "\" không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                // Xóa tác giả từ CSDL
                boolean deleted = DAO.DAO_TacGia.deleteTacGia(maTacGia);

                if (deleted) {
                    JOptionPane.showMessageDialog(this, "Xóa tác giả thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    // Cập nhật lại bảng hiển thị sau khi xóa
                    loadbangtacgia();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa tác giả thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txt_maTacGia.setText(""); 
        txt_tenTacGia.setText(""); 
        txt_namSinh.setText(""); 
        txt_namMat.setText(""); 
        txt_quocTich.setText(""); 
        
        them_txt_tenTacGia.setText(""); 
        them_txt_namSinh.setText(""); 
        them_txt_namMat.setText(""); 
        them_txt_quocTich.setText(""); 
        
        loadbangtacgia();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
                // Lấy dữ liệu từ các JTextField
            int maTacGia = Integer.parseInt(txt_maTacGia.getText());
            String tenTacGia = txt_tenTacGia.getText();
            int namSinh = Integer.parseInt(txt_namSinh.getText());
            int namMat = Integer.parseInt(txt_namMat.getText());
            String quocTich = txt_quocTich.getText();

            // Kiểm tra xem có sự thay đổi so với dữ liệu ban đầu hay không
            boolean changed = checkChanges(maTacGia, tenTacGia, namSinh, namMat, quocTich);

            if (!changed) {
                JOptionPane.showMessageDialog(this, "Không có thay đổi cần cập nhật.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Gọi phương thức update của DAO_TacGia để cập nhật thông tin tác giả
            boolean updated = DAO.DAO_TacGia.updateTacGia( maTacGia, tenTacGia, namSinh, namMat, quocTich);
            if (updated) {
                // Thông báo cập nhật thành công
                JOptionPane.showMessageDialog(this, "Đã cập nhật thông tin tác giả thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Sau khi cập nhật thành công, cập nhật lại bảng hiển thị
                loadbangtacgia();
            } else {
                // Thông báo cập nhật không thành công
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra trong quá trình cập nhật thông tin tác giả.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Phương thức kiểm tra sự thay đổi so với dữ liệu ban đầu
        private boolean checkChanges(int maTacGia, String tenTacGia, int namSinh, int namMat, String quocTich) {
            // Lấy dữ liệu từ JTable để so sánh
            int selectedRow = TableHienThi.getSelectedRow();
            int maTacGiaInTable = (int) TableHienThi.getValueAt(selectedRow, 0);
            String tenTacGiaInTable = (String) TableHienThi.getValueAt(selectedRow, 1);
            int namSinhInTable = (int) TableHienThi.getValueAt(selectedRow, 2);
            int namMatInTable = (int) TableHienThi.getValueAt(selectedRow, 3);
            String quocTichInTable = (String) TableHienThi.getValueAt(selectedRow, 4);

            txt_maTacGia.setText(""); 
            txt_tenTacGia.setText(""); 
            txt_namSinh.setText(""); 
            txt_namMat.setText(""); 
            txt_quocTich.setText(""); 
            // So sánh các giá trị
            if (maTacGia != maTacGiaInTable ||
                !tenTacGia.equals(tenTacGiaInTable) ||
                namSinh != namSinhInTable ||
                namMat != namMatInTable ||
                !quocTich.equals(quocTichInTable)) {
                return true; // Có sự thay đổi
            }

            return false; // Không có sự thay đổi
            
            
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QL_Sach;
    private javax.swing.JPanel QL_TacGia;
    private javax.swing.JTable TableHienThi;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btn_QuanLyTacGia;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tbTrangchu;
    private javax.swing.JTextField them_txt_namMat;
    private javax.swing.JTextField them_txt_namSinh;
    private javax.swing.JTextField them_txt_quocTich;
    private javax.swing.JTextField them_txt_tenTacGia;
    private javax.swing.JTextField txt_maTacGia;
    private javax.swing.JTextField txt_namMat;
    private javax.swing.JTextField txt_namSinh;
    private javax.swing.JTextField txt_quocTich;
    private javax.swing.JTextField txt_tenTacGia;
    // End of variables declaration//GEN-END:variables
}