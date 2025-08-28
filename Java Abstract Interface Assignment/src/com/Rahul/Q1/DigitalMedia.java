package com.Rahul.Q1;

class DigitalMedia extends LibraryItem implements Searchable {
    public DigitalMedia(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("DigitalMedia: " + title + " by " + author);
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return title.contains(keyword) || author.contains(keyword);
    }
}