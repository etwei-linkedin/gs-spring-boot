package com.example.models.api;

import com.example.services.PaymentStatusService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;


public class Course {
    private PaymentStatusService.PaymentStatus _coursePaymentStatus;
    private String _name;
    private Date _publishDate;
    private String _author;
    private long _id;
    private boolean _isPublic;
    private float _price;

    public Course(String name, Date publishDate, String author, long id, boolean isPublic, float price, PaymentStatusService.PaymentStatus coursePaymentStatus) {
        _name = name;
        _publishDate = publishDate;
        _author = author;
        _id = id;
        _isPublic = isPublic;
        _price = price;
        _coursePaymentStatus = coursePaymentStatus;
    }

    public Course() {

    }

    public PaymentStatusService.PaymentStatus getCoursePaymentStatus() {
        return _coursePaymentStatus;
    }

    public void setCoursePaymentStatus(PaymentStatusService.PaymentStatus coursePaymentStatus) {
        _coursePaymentStatus = coursePaymentStatus;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getPublishDate() {
        return _publishDate;
    }

    public void setPublishDate(Date publishDate) {
        _publishDate = publishDate;
    }

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String author) {
        _author = author;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public boolean isPublic() {
        return _isPublic;
    }

    public void setPublic(boolean aPublic) {
        _isPublic = aPublic;
    }

    public float getPrice() {
        return _price;
    }

    public void setPrice(float price) {
        _price = price;
    }

    public String getCourse(String[] args) throws JsonProcessingException {
        Course course = new Course("Course1", new Date(), "Mary Sima", _id, true, 50f, _coursePaymentStatus);
        return new ObjectMapper().writeValueAsString(course);
    }
}
