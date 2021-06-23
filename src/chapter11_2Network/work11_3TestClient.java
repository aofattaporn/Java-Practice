package chapter11_2Network;

import java.io.IOException;
import java.net.Socket;

public class work11_3TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9000);
    }
}
