package com.Rahul.Q1;

class Magazine extends LibraryItem implements Searchable {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + title + " by " + author);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return title.contains(keyword) || author.contains(keyword);
    }
}