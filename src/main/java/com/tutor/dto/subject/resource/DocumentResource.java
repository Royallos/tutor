package com.tutor.dto.subject.resource;

import org.w3c.dom.Document;

import java.io.File;

public class DocumentResource extends Resource<File> {

    private int id;
    private File file;

    public DocumentResource() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public File getResource() {
        return file;
    }
}
