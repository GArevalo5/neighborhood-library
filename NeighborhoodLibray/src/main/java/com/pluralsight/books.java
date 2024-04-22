package com.pluralsight;

public class books {
    //private variables
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructors
    public books(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";}

    //getters and setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getCheckedOutTo() {return checkedOutTo;}
    public void setCheckedOutTo(String checkedOutTo) {this.checkedOutTo = checkedOutTo;}

    public boolean isCheckedOut() {return isCheckedOut;}
    public void setCheckedOut(boolean checkedOut) {isCheckedOut = checkedOut;}



}
