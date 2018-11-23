package com.yixing.splib.entity;

import java.util.Date;

public class Catalog {
    private String subnum;

    private String classnum;

    private String isbn;

    private String bookName;

    private String bookNames;

    private String bookAuthor;

    private String bookAuthors;

    private String bookVersion;

    private String bookPress;

    private Date bookPubdate;

    private Integer bookPage;

    private Integer bookPrice;

    private Date bookDate;

    private Integer bookRemainnum;

    private Integer bookNum;

    private String catalogMan;

    private String iscanceled;

    public String getSubnum() {
        return subnum;
    }

    public void setSubnum(String subnum) {
        this.subnum = subnum == null ? null : subnum.trim();
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum == null ? null : classnum.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookNames() {
        return bookNames;
    }

    public void setBookNames(String bookNames) {
        this.bookNames = bookNames == null ? null : bookNames.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(String bookAuthors) {
        this.bookAuthors = bookAuthors == null ? null : bookAuthors.trim();
    }

    public String getBookVersion() {
        return bookVersion;
    }

    public void setBookVersion(String bookVersion) {
        this.bookVersion = bookVersion == null ? null : bookVersion.trim();
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    public Date getBookPubdate() {
        return bookPubdate;
    }

    public void setBookPubdate(Date bookPubdate) {
        this.bookPubdate = bookPubdate;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Integer getBookRemainnum() {
        return bookRemainnum;
    }

    public void setBookRemainnum(Integer bookRemainnum) {
        this.bookRemainnum = bookRemainnum;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public String getCatalogMan() {
        return catalogMan;
    }

    public void setCatalogMan(String catalogMan) {
        this.catalogMan = catalogMan == null ? null : catalogMan.trim();
    }

    public String getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(String iscanceled) {
        this.iscanceled = iscanceled == null ? null : iscanceled.trim();
    }
}