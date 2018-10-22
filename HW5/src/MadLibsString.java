
public class MadLibsString implements MadLibsDecorator{

	private String myString;

	public MadLibsString(String s) {
		myString = s;
	}
	
	@Override
	public String decorateString(String input) {
		return myString;
	}
	


}
