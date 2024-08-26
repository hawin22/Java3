/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.text.DecimalFormat;

/**
 *
 * @author Hawin
 */
public class Diem {
    private String maSV;
    private String tenSV;
    private Double diemTA;
    private Double diemTH;
    private Double diemGDTC;

    public Diem() {
    }

    public Diem(String maSV, String tenSV, Double diemTA, Double diemTH, Double diemGDTC) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTA = diemTA;
        this.diemTH = diemTH;
        this.diemGDTC = diemGDTC;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Double getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(Double diemTA) {
        this.diemTA = diemTA;
    }

    public Double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(Double diemTH) {
        this.diemTH = diemTH;
    }

    public Double getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(Double diemGDTC) {
        this.diemGDTC = diemGDTC;
    }
      public double getTBC() {
        return ((int) (((getDiemTA()+ getDiemTH()+ getDiemGDTC()) / 3) * 100.0)) / 100.0;
    }
//    public Double dtb;
    
//    public Double diemtb() {
//        if (diemTA == null && diemTH == null && diemGDTC == null) {
//            return dtb = 0.0;
//        } else {
//            double result = (diemTH + diemTA + diemGDTC) / 3;
//
//            DecimalFormat decimalFormat = new DecimalFormat("#.##");
//            String formattedResult = decimalFormat.format(result);
//
//            double dtb = Double.parseDouble(formattedResult);
//            return dtb;
//        }
//
//    }
}
