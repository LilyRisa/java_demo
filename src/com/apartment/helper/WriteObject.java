package com.apartment.helper;

import java.io.*;

public class WriteObject {

    private String FileName;

    private String object;

    public void WriteObject(String file){
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

}
