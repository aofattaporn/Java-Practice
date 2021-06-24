package chapter11_2Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class work11_4_1LoginSever {
    public static void main(String[] args) throws IOException {
        // Connecting Sever and Client
        ServerSocket severSocket = new ServerSocket(8000);
        Socket socket = severSocket.accept();
        // get InputStream
        InputStream in = socket.getInputStream();
        // Writing data Stream
        DataInputStream dataIn = new DataInputStream(in);
        String login = dataIn.readUTF();
        String password = dataIn.readUTF();
        String result = "Login and Password : ";
        if (login.equals("java") && password.equals("password")) {
            result += "ถั่วต้ม";
        }
        else {
            result += "ผิดง้าบ";
        }

        //ส่งข้อมูลกลับไป Client
        OutputStream out = socket.getOutputStream();
        DataOutputStream dataOut = new DataOutputStream(out);
        // closing method
        dataOut.writeUTF(result);
        out.close();
        dataOut.close();
        in.close();
        dataIn.close();
        socket.close();
        severSocket.close();
    }
}
