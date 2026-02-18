package dev.codecounty.test.practice_2;

import java.io.*;

public class DiaryManagerStream {



    public static void main(String[] args) {
        String diaryFile = "my_diary.txt";
        String backupFile = "diary_backup.txt";

        // Sample messages
        String entry1 = "Entry 1: Today I started learning Java File I/O.\n";
        String entry2 = "Entry 2: It was a bit confusing, but I'm getting the hang of it.\n";
        String entry3 = "Entry 3: I successfully created and copied a file!\n";

        // 1. Write/Append the entries
        writeWithStream(diaryFile, entry1);
        writeWithStream(diaryFile, entry2);
        writeWithStream(diaryFile, entry3);

        // 2. Create a backup
        copyFileWithStream(diaryFile, backupFile);
    }

    public static void writeWithStream(String fileName, String message) {
        // The second parameter 'true' enables Append Mode
        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            // FileOutputStream writes bytes, so we must convert the String
            byte[] bytes = message.getBytes();
            fos.write(bytes);
            System.out.println("Appended message to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
        }
    }

    public static void copyFileWithStream2(String source, String destination) {
        try (
                InputStream in = new FileInputStream(source);
                OutputStream out = new FileOutputStream(destination);
        ) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            System.out.println("Copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyFileWithStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            // Read one byte at a time until the end of the file (-1)
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("Backup successful via byte stream!");

        } catch (IOException e) {
            System.out.println("Copy error: " + e.getMessage());
        }
    }


}