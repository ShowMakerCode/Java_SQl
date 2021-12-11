/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassOOp;

/**
 *
 * @author 98tae
 */
public class Grade {
   private int ID;
   private String MaSV;
   private double Tienganh,Tinhoc,GDTC;

    public Grade() {
    }

    public Grade(int ID, String MaSV, double Tienganh, double Tinhoc, double GDTC) {
        this.ID = ID;
        this.MaSV = MaSV;
        this.Tienganh = Tienganh;
        this.Tinhoc = Tinhoc;
        this.GDTC = GDTC;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public double getTienganh() {
        return Tienganh;
    }

    public void setTienganh(double Tienganh) {
        this.Tienganh = Tienganh;
    }

    public double getTinhoc() {
        return Tinhoc;
    }

    public void setTinhoc(double Tinhoc) {
        this.Tinhoc = Tinhoc;
    }

    public double getGDTC() {
        return GDTC;
    }

    public void setGDTC(double GDTC) {
        this.GDTC = GDTC;
    }

   

 
   
   
   
}
