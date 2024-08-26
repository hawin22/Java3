/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.XeMay;
import java.sql.*;
/**
 *
 * @author Hawin
 */
public interface Service {
    ArrayList<XeMay> getAll();
    XeMay getRow(int row);
    boolean add(XeMay xm);
    void Update(XeMay xm);
}
