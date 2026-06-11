package com.priyanshu.lab4.ex3;

public abstract class MediaItem extends Item {
    private int runtime; 

    public MediaItem(String id, String title, int numCopies, int runtime) {
        super(id, title, numCopies);
        this.runtime = runtime;
    }

    
    public int getRuntime() {
		return runtime;
	}


	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


	@Override
    public String toString() {
        return super.toString() + " | Runtime: " + runtime + " mins";
    }
}
