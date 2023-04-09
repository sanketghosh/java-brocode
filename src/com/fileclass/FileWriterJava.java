package com.fileclass;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterJava {
    public static void main(String[] args) {

        String writtenFilePath="C:\\Users\\sanke\\OneDrive\\Desktop\\FileManager\\JAVA\\oopsbrocode\\src\\com\\fileclass\\poem.txt";

        try{
            FileWriter writer = new FileWriter(writtenFilePath);
            writer.write("Roses are red\nViolets are blue\nRockin' everywhere");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
