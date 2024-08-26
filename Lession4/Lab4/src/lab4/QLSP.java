/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLSP {
    ArrayList<SanPham> list = new ArrayList<>();
    public QLSP() {
        list.add(new SanPham("SP01", "Dầu gội đầu Head & Shoulder", "Chai", 34000, "Unilevers"));
        list.add(new SanPham("SP02", "Xà phòng Omo", "Thùng", 124000, "Unilevers"));
        list.add(new SanPham("SP03", "Dầu ăn Tường An 5 lít", "Chai", 100000, "Tường An"));
        list.add(new SanPham("SP04", "Mì ăn liền Hao Hao", "Thùng", 75000, "AceCook"));
        list.add(new SanPham("SP05", "Đường tinh luyện", "kg", 14000, "Dương Biên Hoa"));
        list.add(new SanPham("SP06", "Sữa Ông Thọ", "Lon", 3000, "VinaMilk"));
    }
    ArrayList<SanPham> getListSP(){
        return list;
    }
    
     Boolean add(SanPham sp){
        list.add(sp);
        return true;
    }
     Boolean delete(int i) {
        list.remove(i);
        return true;
    }
     
      Boolean update(int viTri, SanPham sp){
     list.set(viTri, sp);
     return true;
    }
}
