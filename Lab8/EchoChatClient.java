
package Bai7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;



public class EchoChatClient {
	public final static String SERVER_IP = "127.0.0.1";
	public final static int SERVER_PORT = 7;

	public static void main(String[] args) throws IOException, InterruptedException {
		Socket socket = null;
		try {
                    //Khởi tạo socket
			socket = new Socket(SERVER_IP, SERVER_PORT); // Connect to server
			System.out.println("Kết nối thành công: " + socket);
			InputStream is = socket.getInputStream();  // nhận dữ liệu
			OutputStream os = socket.getOutputStream(); //truyền dữ liệu lên server
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap so can kiem tra :");
			double soa = sc.nextDouble();
			
			os.write((int) soa); //đảy dữ liệu đi
			os.flush();//đẩy dữ liệu đi
			int ch = is.read();//nhận dữ liệu về

			if (ch % 2 == 0)
				System.out.println(+ch + " là số chẵn ");
			else {
				System.out.println(+ch + " là số lẻ ");

			}

                      if (isPrimeNumber(ch)) {
                    	  System.out.println(+ch + " là số nguyên tố ");
					}
                     else {
                    	 System.out.println(+ch + "không là  số nguyên tố ");
					}
			
			//số hoàn hảo
			int sum = 0;
			for (int i = 1; i <= ch / 2; i++) {
				if (ch % i == 0)
					// tổng các ước số của a
					sum += i;
			}
			if (sum == ch) {
				System.out.println(ch + " là số hoàn hảo");
			} else {
				System.out.println(ch + " không phải là số hoàn hảo");
			}

		} catch (IOException ie) {
                    ie.printStackTrace();
			System.out.println("Can't connect to server");
		} finally {
			if (socket != null) {
				socket.close();
			}
		}

	}
	
	
	public static boolean isPrimeNumber(int n) {
       
        if (n < 2) {
            return false;
        }
     
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}