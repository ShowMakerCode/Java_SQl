/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide;

/**
 *
 * @author 98tae
 */
public class KhoaHoc {
      private String maKH,tenKH;
      private double hocPhi;
      private int thoiLuong;

    public KhoaHoc() {
    }

      
    public KhoaHoc(String maKH, String tenKH, double hocPhi, int thoiLuong) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
      
      
    
}
