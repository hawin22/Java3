/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Hawin
 */
public class Bai1Service {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        try {
            ServerSocket svSK = new ServerSocket(8888);
            System.out.println("Server is Connecting....");
            Socket socket = svSK.accept();

            System.out.println("Server Connected");
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            while (true) {

                System.out.print("Num 1: ");
                double number1 = inputStream.readDouble();
                System.out.print("Num 2: ");
                double number2 = inputStream.readDouble();
                double sum = number1 + number2;
                System.out.println("Sum: " + sum);
                outputStream.writeDouble(sum);
                outputStream.flush();
            }

        } catch (Exception ex) {
            
        }
    }
    
}
