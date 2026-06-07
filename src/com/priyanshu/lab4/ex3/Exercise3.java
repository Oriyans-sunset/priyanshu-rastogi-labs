package com.priyanshu.lab4.ex3;

public class Exercise3 {

	public static void main(String[] args) {
		Item harrypotterBook = new Book("1345AB", "Harry Potter", 2, "JK Rowling");
        Item researchPaper = new JournalPaper("4535JP", "Attention Is All You Need", 5, "Vaswani", 2017);
        Item movie = new Video("6438AM", "Inception", 1, 148, "Christopher Nolan", "Sci-fi", 2010);
        Item musicAlbum = new CD("9564CD", "Take Care", 3, 47, "Drake", "Hip-hop/rap");

        System.out.println("Library Inventory: ");
        harrypotterBook.print();
        researchPaper.print();
        movie.print();
        musicAlbum.print();

        System.out.println("\nCheckin/checkout: ");
        movie.checkOut(); 
        
        movie.checkOut(); 

        movie.checkIn();

	}

}
