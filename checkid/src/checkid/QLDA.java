/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkid;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLDA implements DAO{
    public ArrayList<DA> list;
     public QLDA(){
         list = new ArrayList<>();
     }
    @Override
    public void Insert(DA d) {
        this.list.add(d);
    }

    @Override
    public ArrayList<DA> getList() {
        return this.list;
    }

    @Override
    public void SetList(ArrayList<DA> list) {
        this.list = list;
    }
    
}
