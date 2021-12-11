/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 98tae
 */
public class HocSinh {
    private String maHS,tenHS,GioiTinh;
    private double DiemTB;

    public HocSinh() {
    }

    public HocSinh(String maHS, String tenHS, String GioiTinh, double DiemTB) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.GioiTinh = GioiTinh;
        this.DiemTB = DiemTB;
    }

    
    
    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }
    
    
}
