/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Hawin
 */
public class Slide8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL( "https://vi.wikipedia.org/wiki/B%E1%BB%91_gi%C3%A0_(phim_2021)");
        FileOutputStream fo = new FileOutputStream("‪D:\\Java3\\Lession8");
         InputStream is = url.openStream();
         byte[] buf = new byte[4096];
         while (true) {            
            int n = is.read(buf);
             if (n<=0) {
                 break;
             }
             fo.write(buf, 0, n);
        }
         is.close();
         fo.close();
    }
    
}
