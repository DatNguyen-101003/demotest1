/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vhung
 */
public class TacGia {
    private int maTacGia;
    private String tenTacGia;
    private int namSinh;
    private int namMat;
    private String quocTich;

     public TacGia() {
    }

    @Override
    public String toString() {
        return "TacGia{" + "maTacGia=" + maTacGia + ", tenTacGia=" + tenTacGia + ", namSinh=" + namSinh + ", namMat=" + namMat + ", quocTich=" + quocTich + '}';
    }
    
    // Constructor
    public TacGia(int maTacGia, String tenTacGia, int namSinh, int namMat, String quocTich) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
        this.namMat = namMat;
        this.quocTich = quocTich;
    }

    // Getter và setter cho các thuộc tính
    public int getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(int maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    // Thêm các getter và setter cho các thuộc tính khác
 
}

