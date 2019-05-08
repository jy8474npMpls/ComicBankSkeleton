package com.company;

public class Comic {
    protected int collectorID;
    protected int comicID;
    protected String bookTitle;
    protected int issueNo;
    protected  String issueTitle;
    protected  int year;
    protected double price;
    protected double value;

    public Comic(int collectorID, int comicID, String bookTitle, int issueNo,
                 String issueTitle, int year, double price, double value) {
        this.collectorID = collectorID;
        this.comicID = comicID;
        this.bookTitle = bookTitle;
        this.issueNo = issueNo;
        this.issueTitle = issueTitle;
        this.year = year;
        this.price = price;
        this.value = value;
    }
}
