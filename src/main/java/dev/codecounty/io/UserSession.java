package dev.codecounty.io;

import java.io.*;

public class UserSession implements Externalizable {
    // These will be saved
    private String username;
    private long lastLogin;
    
    // This will NOT be saved (Security)
    private String sessionToken;

    /**
     * MANDATORY: The public no-arg constructor.
     * Externalizable uses this to create the object BEFORE calling readExternal.
     */
    public UserSession() {}

    public UserSession(String username, String sessionToken) {
        this.username = username;
        this.sessionToken = sessionToken;
        this.lastLogin = System.currentTimeMillis();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Custom Writing: " + username);
        // We write only what is necessary
        out.writeUTF(username);
        out.writeLong(lastLogin);
        // Notice: sessionToken is skipped!
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        System.out.println("Custom Reading...");
        // MUST follow the exact same order as writeExternal
        this.username = in.readUTF();
        this.lastLogin = in.readLong();
        
        // We can initialize transient fields to a default state
        this.sessionToken = "EXPIRED"; 
    }

    @Override
    public String toString() {
        return "User: " + username + " | Logged in at: " + lastLogin + " | Token: " + sessionToken;
    }
}