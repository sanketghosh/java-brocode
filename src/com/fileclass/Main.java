package com.fileclass;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        // File -an abstract representation of file and directory path-names


        String filePath = "C:\\Users\\sanke\\OneDrive\\Desktop\\FileManager\\JAVA\\oopsbrocode\\src\\com\\fileclass\\secret_message.txt";

        File file = new File(filePath);

        if (file.exists()) {

            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
        } else {

            System.out.println("The file doesn't exist");

        }

    }
}
