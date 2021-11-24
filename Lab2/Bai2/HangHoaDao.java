/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class HangHoaDao {
    ArrayList<HangHoa> lsHH = new ArrayList<>();
    public int add(HangHoa hh){
        lsHH.add(hh);
        return 1;
    }
    public int cont(){
        return lsHH.size();
    }
    public ArrayList<HangHoa> getAllSanPham(){
        return lsHH;
    }
    public HangHoa findMaHH(String Ma){
        for(HangHoa hh : lsHH){
            if(hh.getMaHH().equalsIgnoreCase(Ma)){
                return hh;
            }
        }
        return null;
    }
   
}
