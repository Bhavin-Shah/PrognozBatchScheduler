package com.prognoz.models;

/**
 *
 * @author Bhavin
 */
public class BatchModel {

    String batchName;
    String trainerName;
    String batchSize;
    String technology;
    String startDate;
    String endDate;

    public BatchModel(String batchName, String trainerName, String batchSize, String technology, String startDate, String endDate) {
        this.batchName = batchName;
        this.trainerName = trainerName;
        this.batchSize = batchSize;
        this.technology = technology;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BatchModel() {
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
