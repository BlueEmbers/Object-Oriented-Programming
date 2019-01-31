package customException;

public class GpaTooBigException extends Exception{

	public GpaTooBigException() {
		super("Hey! Gpa too big");
		// TODO Auto-generated constructor stub
	}

	public GpaTooBigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public GpaTooBigException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GpaTooBigException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GpaTooBigException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
