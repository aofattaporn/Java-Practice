package chapter11_IOStreamAndNetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class work11_fileReader {
    public static void main(String[] args) throws IOException{

//        fileReader();
        System.out.println("\n==================");
        fileReaderBuffer();
        System.out.println("==================");
        fileScanner();
        System.out.println("==================");


    }
    private static void fileReader() throws IOException {
        FileReader file = new FileReader("src/chapter11_IOStreamAndNetwork/Character1.txt");
        int ch = ' ';
        while ((ch = file.read()) != -1){
            System.out.print((char) ch);
        }
        file.close();
    }
    private static void fileReaderBuffer() throws IOException {
        FileReader file = new FileReader("src/chapter11_IOStreamAndNetwork/Character2.txt");
        BufferedReader reader = new BufferedReader(file);
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();
    }

    private static void fileScanner() throws IOException {
        FileReader file = new FileReader("src/chapter11_IOStreamAndNetwork/Character3.txt");
        Scanner scanner = new Scanner(file);
        String counter = scanner.useDelimiter("\\A").next();
        System.out.println(counter);
    }
}
