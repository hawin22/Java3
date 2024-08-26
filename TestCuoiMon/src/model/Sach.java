/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hawin
 */
public class Sach {
    String ma;
    String ten;
    double gia;
    int trangThai;

    public Sach() {
    }

    public Sach(String ma, String ten, double gia, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Sach{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", trangThai=" + trangThai + '}';
    }
   public void inThongTin(){
       System.out.println("Sach{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", trangThai=" + trangThai + '}');
   } 
}
