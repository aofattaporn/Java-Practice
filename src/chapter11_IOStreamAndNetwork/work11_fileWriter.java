package chapter11_IOStreamAndNetwork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class work11_fileWriter {
    public static void main(String[] args) throws IOException {
        fileWriter();
        fileWriterAndBuffer();
        printWriter();

    }

    private static void fileWriter () throws IOException {
        FileWriter writer = new FileWriter("src/chapter11_IOStreamAndNetwork/Character1.txt");
        writer.write("Hello world");
        writer.write("\ntest 1 ");
        writer.close();
    }

    private static void fileWriterAndBuffer() throws IOException {
        FileWriter writer = new FileWriter("src/chapter11_IOStreamAndNetwork/Character2.txt");
        BufferedWriter bfwriter = new BufferedWriter(writer);
        bfwriter.write("Hello world 2 ");
        bfwriter.close();
    }

    private static void printWriter() throws IOException {
        PrintWriter writer = new PrintWriter("src/chapter11_IOStreamAndNetwork/Character3.txt");
        writer.println("Helloworld");
        writer.print("x : ");
        writer.printf(" %d", 3);
        writer.close();
    }


}
