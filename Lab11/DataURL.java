/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11.b6;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author admin
 */
public class DataURL {

   /* public static void main(String[] args) {
        try {
            DownloadResource dlr = new DownloadResource();
            URL url = new URL("http://cdn2.tstatic.net/tribunnews/foto/bank/images/ShailaSabt.jpg");
            String destinationFilePath = "c:/a/girl.jpg";
            long bytes = dlr.download(url, destinationFilePath);
            System.out.printf("%d bytes downloaded", bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long download(URL url, String destinationFilePath) throws Exception {
        long bytes = 0;
        FileOutputStream fos = new FileOutputStream(destinationFilePath);
        int len = 512;
        InputStream is = url.openStream();

        byte[] buffer = new byte[512];
        while (is.available() != 0) {
            len = is.read(buffer);
            bytes += len;
            fos.write(buffer, 0, len);
        }
        fos.close();
        return bytes;
    }*/
}
