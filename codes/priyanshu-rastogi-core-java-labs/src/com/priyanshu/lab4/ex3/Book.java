package com.priyanshu.lab4.ex3;

public class Book extends WrittenItem {
    
    public Book(String id, String title, int numCopies, String author) {
        super(id, title, numCopies, author);
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", numCopies=" + numCopies + ", getAuthor()=" + getAuthor()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getNumCopies()=" + getNumCopies() + ", getClass()=" + getClass()
				+ "]";
	}

}