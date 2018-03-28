package TP3;

public class NoSuchElementException extends Exception {
	@Override
	public String getMessage() {
		return "Il n'y a pas cette chanson dans la bibliothèque malheureusement";
	}
}
