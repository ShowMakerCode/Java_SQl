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
public interface DAO {
    public void Insert(DA d);
    public ArrayList<DA> getList();
    public void SetList(ArrayList<DA> list);
}
