package com.libary.demo.models;

public class ScienceBook extends Book {

    private int sciIndex;


    public ScienceBook(String name, String author, String barcode, String quantity, String price, int sciIndex) {
        super(name, author, barcode, quantity, price);
        this.sciIndex = sciIndex;
    }

    public int getSciIndex() {
        return sciIndex;
    }

    public void setSciIndex(int sciIndex) {
        this.sciIndex = sciIndex;
    }
}
