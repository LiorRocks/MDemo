package com.lior.MenoraDemo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "root_documents")
public class RootDocument {

    @Id
    @Column(name = "id")
    private int _id;
    @OneToOne
    private RequestDetails requestDetails;
    @OneToMany
    private List<Event> events;

    public RootDocument() {
    }

    public RootDocument(RequestDetails requestDetails, List<Event> events) {
        this.requestDetails = requestDetails;
        this.events = events;
    }

    public RequestDetails getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(RequestDetails requestDetails) {
        this.requestDetails = requestDetails;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
