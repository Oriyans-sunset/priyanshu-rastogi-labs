package com.priyanshu.lab4.ex3;

import java.util.Objects;

public abstract class Item {
	String id;
	String title;
	int numCopies;
	
	public Item(String id, String title, int numCopies) {
		super();
		this.id = id;
		this.title = title;
		this.numCopies = numCopies;
	}
	
	public void checkIn() {
        numCopies += 1;
        System.out.println(title + " checked in succesfully");
    }
	
	public void checkOut() {
        if (numCopies > 0) {
            numCopies -= 1;
            System.out.println(title + " checked out succesfully");
        } else {
            System.out.println(title + " is out of stock");
        }
    }

    public void addItem(int copiesToAdd) {
        if (copiesToAdd > 0) {
            this.numCopies += copiesToAdd;
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumCopies() {
		return numCopies;
	}

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numCopies, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && numCopies == other.numCopies && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numCopies=" + numCopies + "]";
	}
	
	

}
