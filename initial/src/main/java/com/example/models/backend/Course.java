package com.example.models.backend;

import java.util.Date;


public class Course {
  private String _name;
  private Date _publishDate;
  private String _author;
  private long _id;
  private boolean _isPublic;

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
}
