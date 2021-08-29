package com.lior.MenoraDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "request_details")
public class RequestDetails {
    @Id
    @Column(name = "id")
    private int _id;
    @Column(name = "uuid")
    private UUID id;
    @Column(name = "acceptDate")
    private Date acceptDate;
    @Column(name = "sourceCompany")
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
