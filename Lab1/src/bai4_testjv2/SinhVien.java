/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_testjv2;

import java.io.Serializable;

/**
 *
 * @author 98tae
 */
public class SinhVien implements Serializable{
    private String Masv;
    private String Hoten;
    private String gioitinh;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String Masv, String Hoten, String gioitinh, double diem) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.gioitinh = gioitinh;
        this.diem = diem;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "Masv=" + Masv + ", Hoten=" + Hoten + ", gioitinh=" + gioitinh + ", diem=" + diem + '}';
    }
    
    public String getKetQua(){
        if (diem > 5) {
            return "Đạt";
        } else {
            return "Trượt";
        }
    }
    
    
}
