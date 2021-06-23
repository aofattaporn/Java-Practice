package chapter11_2Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class work11_2TestSever {
    public static void main(String[] args) throws IOException {
        // connect sever and client
        ServerSocket seversocket = new ServerSocket(9000);
        Socket socket = seversocket.accept();
    }
}
