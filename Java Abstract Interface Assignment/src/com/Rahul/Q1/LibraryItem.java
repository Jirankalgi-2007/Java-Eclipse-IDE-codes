package com.Rahul.Q1;

public abstract class LibraryItem {
    protected String title;
    protected String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayDetails();
    public abstract boolean matchesKeyword(String keyword);
}