/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author Hawin
 */
public interface NhanVienService {
    ArrayList<NhanVien> getAll();
    NhanVien getRow(int row);
    boolean addNV(NhanVien nv);
    void update(NhanVien nv);
    void delete(String ma);
}
