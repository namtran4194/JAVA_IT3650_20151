package namtran.hust.exceptions;

public class InvalidHazchemCodeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidHazchemCodeException() {
		super("Somthing wrong!");
	}

	public InvalidHazchemCodeException(String msg) {
		super(msg);
	}
}
