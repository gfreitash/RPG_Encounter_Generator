package exception;

public class RequirementNotMetException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequirementNotMetException() {
		super();
	}
	
	public RequirementNotMetException(String s) {
		super(s);
	}
}
