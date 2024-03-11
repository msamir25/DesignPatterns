package org.example.structuralPatterns.decerator;

public class EncryptedCloudStream implements Stream{

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encryptData = encrypt(data);
        stream.write(encryptData);
    }

    private String encrypt(String date){
        return "@#$@@$%%##@@@@@$$#";
    }
}
