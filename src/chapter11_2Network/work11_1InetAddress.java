package chapter11_2Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class work11_1InetAddress {
    public static void main(String[] args) throws IOException {
        testMyIP();


    }

    private static void testMyIP() {
        InetAddress inet = InetAddress.getLoopbackAddress();
        System.out.println("IP   : " + inet.getHostAddress());
        System.out.println("Host : " + inet.getHostName());

    }

}
