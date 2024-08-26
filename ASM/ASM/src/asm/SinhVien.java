/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Hawin
 */
public class SinhVien {
    private String ma;
    private String hoTen;
    private String email;
    private String SDT;
    private Boolean gioiTinh;
    private String diaChi;
    private String linkAnh;
    public SinhVien() {
    }
    
    public SinhVien(String ma, String hoTen, String email, String SDT, Boolean gioiTinh, String diaChi, String linkAnh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.email = email;
        this.SDT = SDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.linkAnh = linkAnh;
    }

    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        this.linkAnh = linkAnh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", hoTen=" + hoTen + ", email=" + email +"\n"+ 
                ", SDT=" + SDT + ", gioiTinh=" + gioiTinh +"\n" +
                ", diaChi=" + diaChi + ", linkAnh=" + linkAnh + '}';
    }
    
    
    
}
