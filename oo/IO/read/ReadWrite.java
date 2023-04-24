package oo.IO.read;

import java.io.*;

public class ReadWrite {
    public  void readText() {
        try {
            FileInputStream fs = new FileInputStream("./src/IO/read/in.txt");
            FileOutputStream fo = new FileOutputStream("./src/IO/read.out.txt");
            int c;
            while ((c = fs.read()) != 1) {
                fo.write(c);
                System.out.println(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readLine(){
        try{
            BufferedReader bf = new BufferedReader(new FileReader("./src/IO/read/in.txt"));
            String line = bf.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ReadWrite read = new ReadWrite();
        // read.readText();
        read.readLine();
    }
}
