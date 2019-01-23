package com.example.tranvanha.finalapp2;

public class DuLieu_Input_LogIn {
    String Username;
    String Password;
    int TypeClient;
    String ClientVersion;

    public DuLieu_Input_LogIn(String username, String password, int typeClient, String clientVersion) {
        Username = username;
        Password = password;
        TypeClient = typeClient;
        ClientVersion = clientVersion;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getTypeClient() {
        return TypeClient;
    }

    public void setTypeClient(int typeClient) {
        TypeClient = typeClient;
    }

    public String getClientVersion() {
        return ClientVersion;
    }

    public void setClientVersion(String clientVersion) {
        ClientVersion = clientVersion;
    }
}
