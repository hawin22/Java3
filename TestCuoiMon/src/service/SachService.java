/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Sach;
import java.sql.*;

/**
 *
 * @author Hawin
 */
public interface SachService {

    ArrayList<Sach> list = new ArrayList<>();

    ArrayList<Sach> getAll();

    Sach getRow(int row);

    void update(Sach s);

    void delete(String maS);
}
