import java.io.FileNotFoundException;

public class RunHW5 {

	public static void main(String[] args) throws FileNotFoundException {
		MadLibsDecorator firstString = new MadLibsString("Without precise <noun>s we could <verb> right through a <noun> or <verb> too close to a <noun>, and that’d end your <noun> real quick, wouldn’t it?");
		
		VerbReplacementDecorator verbReplace = new VerbReplacementDecorator(firstString);
		NounReplacementDecorator NounReplace = new NounReplacementDecorator(verbReplace);
		System.out.println(NounReplace.decorateString("") + "\n");
		
		MadLibsDecorator secondString = new MadLibsString("Hokey <noun>s and ancient <noun>s are no <verb> for a good <noun> at your side, kid.");
		VerbReplacementDecorator verbReplace2 = new VerbReplacementDecorator(secondString);
		NounReplacementDecorator NounReplace2 = new NounReplacementDecorator(verbReplace2);
		System.out.println(NounReplace2.decorateString(""));
		
		/*NounReplacementDecorator NounReplace = new NounReplacementDecorator(firstString);
		VerbReplacementDecorator verbReplace = new VerbReplacementDecorator(NounReplace);

		System.out.println(verbReplace.decorateString("") + "\n");
		
		MadLibsDecorator secondString = new MadLibsString("Hokey <noun>s and ancient <noun>s are no <verb> for a good <noun> at your side, kid.");
		NounReplacementDecorator NounReplace2 = new NounReplacementDecorator(secondString);
		VerbReplacementDecorator verbReplace2 = new VerbReplacementDecorator(NounReplace2);

		System.out.println(verbReplace2.decorateString(""));*/
		
	}

}
