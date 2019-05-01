package com.company;

public class Comic {
    protected int collectorNo;
    protected String bookTitle;
    protected int issueNo;
    protected  int year;
    protected  String issueTitle;
    protected double price;
    protected double value;

    public Comic(int collectorNo, String bookTitle, int issueNo, int year, String issueTitle, double price, double value) {
        this.collectorNo = collectorNo;
        this.bookTitle = bookTitle;
        this.issueNo = issueNo;
        this.year = year;
        this.issueTitle = issueTitle;
        this.price = price;
        this.value = value;
    }
}
