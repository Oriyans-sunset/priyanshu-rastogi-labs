package com.priyanshu.lab4.ex3;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int numCopies, String author, int yearPublished) {
        super(id, title, numCopies, author);
        this.yearPublished = yearPublished;
    }

    

    public int getYearPublished() {
		return yearPublished;
	}



	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}



	@Override
    public String toString() {
        return super.toString() + " | Published: " + yearPublished;
    }
}