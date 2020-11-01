package exception;

public class MemberDoesntHaveSuchSkillException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	
	public MemberDoesntHaveSuchSkillException() {
		super();
	}
	
	public MemberDoesntHaveSuchSkillException(String s) {
		super(s);
	}

}
