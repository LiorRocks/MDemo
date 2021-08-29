package com.lior.MenoraDemo.model;

import java.util.Date;
import java.util.UUID;

public class RequestDetails {
    private UUID id;
    private Date acceptDate;
    private String sourceCompany;

    public RequestDetails(UUID id, Date acceptDate, String sourceCompany) {
        this.id = id;
        this.acceptDate = acceptDate;
        this.sourceCompany = sourceCompany;
    }

    public RequestDetails() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getSourceCompany() {
        return sourceCompany;
    }

    public void setSourceCompany(String sourceCompany) {
        this.sourceCompany = sourceCompany;
    }
}
