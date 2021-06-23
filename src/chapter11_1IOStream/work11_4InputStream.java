package chapter11_1IOStream;

import java.io.*;

public class work11_4InputStream {
    public static void main(String[] args) throws IOException{
        noBuffer();
        Buffer();
    }
    private static void noBuffer() throws IOException {
        FileInputStream file = new FileInputStream("src/chapter11_IOStreamAndNetwork/ByteStreamWrite1.txt");
        DataInputStream data = new DataInputStream(file);
        System.out.println(data.readUTF());
        data.close();
        file.close();
    }
    private static void Buffer() throws IOException {
        FileInputStream file = new FileInputStream("src/chapter11_IOStreamAndNetwork/ByteStreamWrite1.txt");
        BufferedInputStream buff = new BufferedInputStream(file);
        DataInputStream data = new DataInputStream(buff);
        System.out.println(data.readUTF());
        data.close();
        file.close();
    }
}
