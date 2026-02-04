package dev.codecounty.io;

import java.io.*;

public class ExternalizableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserSession session = new UserSession("Suman_Dev", "secret-token-123");
        String filename = "session.ser";

        // Save it
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(session);
        }

        // Load it
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            UserSession loadedSession = (UserSession) ois.readObject();
            System.out.println("Original: " + session);
            System.out.println("Loaded  : " + loadedSession);
        }
    }
}