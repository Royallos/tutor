package com.tutor.dto.subject.resource;

import java.util.Collections;
import java.util.List;

public abstract class Resourced {

    private List<Resource<ImageResource>> images;
    private List<Resource<DocumentResource>> documents;

    public List<Resource<ImageResource>> getImages() {
        return Collections.unmodifiableList(images);
    }
    public void addImage(Resource<ImageResource> testWork) {this.images.add(testWork);}
    public void removeImage(Resource<ImageResource> testWork) {this.images.remove(testWork);}
    public List<Resource<DocumentResource>> getDocuments() {
        return Collections.unmodifiableList(documents);
    }
    public void addDocuments(Resource<DocumentResource> testWork) {this.documents.add(testWork);}
    public void removeDocuments(Resource<DocumentResource> testWork) {this.documents.remove(testWork);}
}
