package exception;

public class NotAvailablePointsLeftException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;
	
	public NotAvailablePointsLeftException() {
		super();
	}
	
	public NotAvailablePointsLeftException(String s) {
		super(s);
	}
	

}
