package com.apartment.helper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObject {

    private String FileName;

    private String object;

    public WriteObject(String file){
        FileName = file;
    }
    public void setContent(String content){
        object = content;
    }

    public void Write() throws IOException {
        ObjectOutputStream files = new ObjectOutputStream(new FileOutputStream(new File(FileName)));
        files.writeObject(object);
        files.close();
    }

    public ArrayList<String> ReadFile() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(FileName)));
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(content.split(",")));
        return myList;
    }

}
