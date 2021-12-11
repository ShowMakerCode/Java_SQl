/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author 98tae
 */
public class OOPQLSV {
    private String masv,hoten,gioitinh,mamon,tenmon;
    private int diem;

    public OOPQLSV() {
    }

    public OOPQLSV(String masv, String hoten, String gioitinh, String mamon, String tenmon, int diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    
}
