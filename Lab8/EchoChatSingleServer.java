package Bai7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoChatSingleServer {

	public final static int SERVER_PORT = 7;

	public static void main(String[] args) throws IOException {
            //khởi tạo 1 server
		ServerSocket serverSocket = null;
		try {
			System.out.println("Đang kết nối vào cổng " + SERVER_PORT + ", vui lòng chờ  ...");
			serverSocket = new ServerSocket(SERVER_PORT);
			System.out.println("Server đã khởi động: " + serverSocket);
			System.out.println("Đang đợi máy khách ...");
			
			while (true) {
				try {
					
					Socket socket = serverSocket.accept();//trả về đồi tượng client vừa kết nối đến
					System.out.println("Client đã chấp nhận: " + socket);
                                        InputStream is = socket.getInputStream();//luồng nhận dữ liệu từ client gửi đến
					OutputStream os = socket.getOutputStream();//luồng gửi dữ liệu cho client
					
					int ch = 0;
					while (true) {
						ch = is.read(); // Nhận dữ liệu từ  client
						if (ch < 0) {
							
							break;
						}
						os.write(ch); // Gửi kết quả tới client
					}
                                        serverSocket.close();
					socket.close();
                                        is.close();
                                        os.close();
				} catch (IOException e) {
					System.err.println(" Connection Error: " + e);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}

}