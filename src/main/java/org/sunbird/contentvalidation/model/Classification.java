
package org.sunbird.contentvalidation.model;

public class Classification {
    private int correctPercentage;
    private int incorrectPercentage;

    public int getCorrectPercentage() {
        return correctPercentage;
    }

    public void setCorrectPercentage(int correctPercentage) {
        this.correctPercentage = correctPercentage;
    }

    public int getIncorrectPercentage() {
        return incorrectPercentage;
    }

    public void setIncorrectPercentage(int incorrectPercentage) {
        this.incorrectPercentage = incorrectPercentage;
    }
}