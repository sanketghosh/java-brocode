package com.fileclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava {

    // FileReader = read the contents of a file as a stream of characters. One by one read() returns as
    // int value which contains the byte value when read() return -1, there is no more data to be read

    public static void main(String[] args) {
       try{
           FileReader reader = new FileReader("art.txt");
           int data = reader.read();
           while (data!=-1){
               System.out.println((char) data);
               data= reader.read();
           }
           reader.close();


       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }

    }

}
