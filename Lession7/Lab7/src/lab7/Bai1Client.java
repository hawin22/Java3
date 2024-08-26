/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai1Client {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Client is Connecting....");
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Client is Connect");
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            while (true) {

                System.out.print("Number 1: ");
                outputStream.writeDouble(sc.nextDouble());
                outputStream.flush();
                System.out.print("Number 2: ");
                outputStream.writeDouble(sc.nextDouble());
                outputStream.flush();
                double tong = inputStream.readDouble();
                System.out.println("Sum: " + tong);
                System.out.print("Tiep tuc? (y/n): ");
                String traloi = new Scanner(System.in).nextLine();

                if (traloi.equals("no")) {
                    break;
                }
            }

        } catch (Exception ex) {
            
        }
    }
}
