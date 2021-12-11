/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_testjv2;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLSV implements DAO{
     public ArrayList<SinhVien> qllist;
    public QLSV(){
        qllist = new ArrayList<>();
    }
        
    @Override
    public void Insert(SinhVien sv) {
    qllist.add(sv);
    }

    @Override
    public void Delete(int Location) {
    qllist.remove(Location);
    }

    @Override
    public ArrayList<SinhVien> geList() {
         return this.qllist;
   
    }
    
}
