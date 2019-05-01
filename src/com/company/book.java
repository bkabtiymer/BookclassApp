package com.company;

public class book extends BookclassApp{

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;

    public book() {}

//    public String displayText(){
//        return getBookTitle()+" "+getBookAuthor()+" "+getBookDescription()+" "+getBookPrice()+" "+getBookStock();


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookStock() {
        return bookStock;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookStock(String bookStock) {
        this.bookStock = bookStock;
    }

    private double bookPrice;
    private String bookStock;

    public void getDisplayText()
    {
        System.out.println("The book information is:" + this.bookTitle + " " + this.bookAuthor + " " + this.bookDescription + " " + this.bookPrice + " " +this.bookStock);
    }

}

