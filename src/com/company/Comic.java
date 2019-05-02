package com.company;

public class Comic {
    protected int collectorNo;
    protected String bookTitle;
    protected int issueNo;
    protected  String issueTitle;
    protected  int year;
    protected double price;
    protected double value;

    public Comic(int collectorNo, String bookTitle, int issueNo,
                 String issueTitle, int year, double price, double value) {
        this.collectorNo = collectorNo;
        this.bookTitle = bookTitle;
        this.issueNo = issueNo;
        this.issueTitle = issueTitle;
        this.year = year;
        this.price = price;
        this.value = value;
    }
}
