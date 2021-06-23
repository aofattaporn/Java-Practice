package chapter11_1IOStream;

import java.io.*;

public class work11_3OutputStream  {
    public static void main(String[] args) throws IOException {
        noBuffer();
        Buffer();
    }

    private static void noBuffer() throws IOException {
        FileOutputStream file = new FileOutputStream("src/chapter11_IOStreamAndNetwork/ByteStreamWrite1.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeUTF("Hello");
        data.close();
        file.close();
    }
    private static void Buffer() throws IOException {
        FileOutputStream file = new FileOutputStream("src/chapter11_IOStreamAndNetwork/ByteStreamWrite2.txt");
        BufferedOutputStream buff = new BufferedOutputStream(file);
        DataOutputStream data = new DataOutputStream(buff);
        data.writeUTF("hello Attaporn aeng");
        data.close();
        buff.close();
        file.close();
    }
}

