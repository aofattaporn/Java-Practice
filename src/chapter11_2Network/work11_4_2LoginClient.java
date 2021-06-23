package chapter11_2Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class work11_4_2LoginClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8000);
        OutputStream out = socket.getOutputStream();
        DataOutputStream datOut = new DataOutputStream(out);
        Scanner scanner = new Scanner(System.in);

        String login ;
        String password;
        System.out.print(" Input User Name : " );
        login = scanner.next();
        System.out.print(" Input User Name : " );
        password = scanner.next();
        datOut.writeUTF(login);
        datOut.writeUTF(password);

        InputStream in = socket.getInputStream();
        DataInputStream dataIn = new DataInputStream(in);
        String str = dataIn.readUTF();
        System.out.println(str);
        dataIn.close();

    }
}
