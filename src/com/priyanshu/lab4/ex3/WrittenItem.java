package com.priyanshu.lab4.ex3;

import java.util.Objects;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(String id, String title, int numCopies, String author) {
		super(id, title, numCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		return Objects.equals(author, other.author);
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
	

}
