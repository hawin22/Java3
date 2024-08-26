/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide1;

/**
 *
 * @author Hawin
 */
public class SinhVien {
private String Hoten;
private String gioiTinh;
private String chuyenNganh;
private String soThich;


    public SinhVien() {
    }

    public SinhVien(String Hoten, String gioiTinh, String chuyenNganh, String soThich) {
        this.Hoten = Hoten;
        this.gioiTinh = gioiTinh;
        this.chuyenNganh = chuyenNganh;
        this.soThich = soThich;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "Hoten=" + Hoten + ", gioiTinh=" + gioiTinh + ", chuyenNganh=" + chuyenNganh + ", soThich=" + soThich + '}';
    }


   
    
}
