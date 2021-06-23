package chapter11_2Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class work11_4_1LoginSever {
    public static void main(String[] args) throws IOException {
        ServerSocket severSocket = new ServerSocket(8000);
        Socket socket = severSocket.accept();
        // รับข้อมูลเข้า
        InputStream in = socket.getInputStream();
        DataInputStream dataIn = new DataInputStream(in);
        String login = dataIn.readUTF();
        String password = dataIn.readUTF();
        String result = "Login and Password ";
        if (login.equals("java") && password.equals("password")) {
            result += "ถั่วต้ม";
        }
        else {
            result += "ผิดง้าบ";
        }

        //ส่งข้อมูลกลับไป Client
        OutputStream out = socket.getOutputStream();
        DataOutputStream dataOut = new DataOutputStream(out);
        dataOut.writeUTF(result);
        out.close();
        dataOut.close();
        in.close();
        dataIn.close();
        socket.close();
        severSocket.close();
    }
}
