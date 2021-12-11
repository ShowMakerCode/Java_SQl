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
public interface DAO {
        public void Insert(SinhVien sv);
        public void Delete(int Location);
        public ArrayList<SinhVien> geList();
}
