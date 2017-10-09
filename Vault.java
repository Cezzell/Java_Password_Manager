package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


private class Vault {

    // inputLine is the way we read from the user
    private static BufferedReader inputLine;

    private static String userName;

    private static String fileName;

    private static FileWriter file;

    public static void main(String[] args) throws IOException {

        inputLine = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Username:");
        userName = inputLine.readLine().trim();
        fileName = "./" + userName;

        File fileHandle = new File(fileName);
        FileWriter file = new FileWriter(System.out);


        System.out.println("Enter your password:");


	// write your code here
    }
}
