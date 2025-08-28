package com.Rahul.Q1;

public class LibrarySearch {
    public static LibraryItem[] searchItems(LibraryItem[] items, String keyword) {
        LibraryItem[] results = new LibraryItem[Searchable.MAX_RESULTS];
        int count = 0;

        for (LibraryItem item : items) {
            if (item.matchesKeyword(keyword)) {
                results[count++] = item;
                if (count == Searchable.MAX_RESULTS) break;
            }
        }

        // Trim the array to actual result size
        LibraryItem[] trimmedResults = new LibraryItem[count];
        System.arraycopy(results, 0, trimmedResults, 0, count);
        return trimmedResults;
    }

    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Java Mastery", "Shrenik"),
            new Magazine("Tech Today", "Deesha"),
            new DigitalMedia("AI Revolution", "Harsh")
        };

        LibraryItem[] results = searchItems(items, "AI");
        for (LibraryItem item : results) {
            item.displayDetails();
        }
    }
}