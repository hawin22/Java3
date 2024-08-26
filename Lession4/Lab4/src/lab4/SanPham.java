/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Hawin
 */
public class SanPham {
    private String ma;
    private String ten;
    private String donvi;
    private Integer gia;
    private String nhaCC;

    public SanPham() {
    }

    public SanPham(String ma, String ten, String donvi, Integer gia, String nhaCC) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.gia = gia;
        this.nhaCC = nhaCC;
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

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }
    
}
