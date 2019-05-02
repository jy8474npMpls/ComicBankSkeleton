package com.company;

public class Collection {
    protected String depositor;
    protected int number;
    protected int size;
    protected  double collectionValue;
    protected  double totalFees;
    protected double totalDividends;

    public Collection(String depositor, int number, int size, double collectionValue,
                      double totalFees, double totalDividends) {
        this.depositor = depositor;
        this.number = number;
        this.size = size;
        this.collectionValue = collectionValue;
        this.totalFees = totalFees;
        this.totalDividends = totalDividends;
    }
}
