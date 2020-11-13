package com.example.springboot;

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
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Date get_publishDate() {
        return _publishDate;
    }

    public void set_publishDate(Date _publishDate) {
        this._publishDate = _publishDate;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public long get_id() {return _id; }

    public void set_id(long _id) { this._id = _id; }

    public boolean is_isPublic() {
        return _isPublic;
    }

    public void set_isPublic(boolean _isPublic) {
        this._isPublic = _isPublic;
    }

    public float get_price() {
        return _price;
    }

    public void set_price(float _price) {
        this._price = _price;
    }

    public PaymentStatusService.PaymentStatus get_coursePaymentStatus() { return _coursePaymentStatus; }

    public void set_coursePaymentStatus(PaymentStatusService.PaymentStatus _coursePaymentStatus) { this._coursePaymentStatus = _coursePaymentStatus; }

    public String getCourse(String[] args) throws JsonProcessingException {
        Course course = new Course("Course1", new Date(), "Mary Sima", _id, true, 50f, _coursePaymentStatus);
        return new ObjectMapper().writeValueAsString(course);
    }
}
