package TP3;

public class Forbidden extends Exception {
	@Override
	public String getMessage() {
		return "AHAHAH interdit dans ton pays";
	}
}
