package org.sunbird.contentvalidation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private String classification;
    private ImageProfanity imageProfanity;
    private List<IndiaMapClassification> indiaClassification;

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public ImageProfanity getImageProfanity() {
        return imageProfanity;
    }

    public void setImageProfanity(ImageProfanity imageProfanity) {
        this.imageProfanity = imageProfanity;
    }

    public List<IndiaMapClassification> getIndiaClassification() {
        return indiaClassification;
    }

    public void setIndiaClassification(List<IndiaMapClassification> indiaClassification) {
        this.indiaClassification = indiaClassification;
    }

}
