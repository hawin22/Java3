/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;

/**
 *
 * @author Hawin
 */
public class QLSV {
    ArrayList<SinhVien> list = new ArrayList<>();
    public QLSV() {
        list.add(new SinhVien("SV01", "Hawin", "hawin.com", "0123456789", false, "Phú Thọ", "C:\\Users\\Hawin\\Documents\\NetBeansProjects\\JavaApplication1\\‪‪‪D:\\Java3\\Image\\images.jpg"));
        list.add(new SinhVien("SV02", "A1", "A1.com", "0123456789", true, "Hải Phòng", "‪D:\\Java3\\Image\\images.jpg"));
        list.add(new SinhVien("SV03", "B2", "B2.com", "0123456789", true, "Hà Nội", "‪D:\\Java3\\Image\\Mickey.JPG"));
        list.add(new SinhVien("SV04", "C3", "C3.com", "0123456789", false, "Phú Thọ", "‪D:\\Java3\\Image\\minion.jpg"));
        list.add(new SinhVien("SV05", "D4", "D4.com", "0123456789", false, "Hải Phòng", "‪D:\\Java3\\Image\\minion.jpg"));   
    }
    ArrayList<SinhVien> getListSV(){
        return list;
    }
    public SinhVien getSVByMa(String ma){
        for (SinhVien sv : list) {
            if (sv.getMa().equals(ma)) {
                return sv;
            }
        }
            return null;
    }
    
}
