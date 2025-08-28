package com.Rahul.Q1;

class Book extends LibraryItem implements Searchable {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return title.contains(keyword) || author.contains(keyword);
    }
}