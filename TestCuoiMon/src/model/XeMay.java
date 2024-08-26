/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hawin
 */
public class XeMay {
    String ma;
    String ten;
    double giaNhap;
    int trangThai;

    public XeMay() {
    }

    public XeMay(String ma, String ten, double giaNhap, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "XeMay{" + "ma=" + ma + ", ten=" + ten + ", giaNhap=" + giaNhap + ", trangThai=" + trangThai + '}';
    }
    
    
}
