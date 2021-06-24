package chapter11_2Network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class work11_5MultiClient {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(9999);
        Socket socket = sever.accept();
        InputStream in;
        DataInputStream dataIn;
        OutputStream out;
        DataInputStream dataOut;
        while (true) {
            socket = sever.accept();
            in = socket.getInputStream();
            dataIn = new DataInputStream(in);
            String login  = dataIn.readUTF();
            String password = dataIn.readUTF();
            String result = "Login and Password : ";
            if (login.equals("java") && password.equals("password") ) {
                result += " ถั่วต้มแล้ว ";
            }
            else {
                result += " ผิดง้าบ ";
            }
            out = socket.getOutputStream();
//            dataOut = new DataInputStream(out);
        }
    }
}
