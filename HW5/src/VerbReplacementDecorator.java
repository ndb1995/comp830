import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VerbReplacementDecorator implements MadLibsDecorator{

	private ArrayList<String> VerbToUse = new ArrayList<String>();
	int IndexIntoList;
	
	MadLibsDecorator mlDecorator;
	Random randy = new Random();
	
	// I load a file into this to give it more variation
	File file = new File("verbs.txt"); 

	VerbReplacementDecorator(MadLibsDecorator mld) throws FileNotFoundException{
		Scanner s = new Scanner(file);
		while (s.hasNext()){
			VerbToUse.add(s.next());
		}
		s.close();
		
		this.mlDecorator = mld;
	}

	@Override
	public String decorateString(String input) {
		String retVal = mlDecorator.decorateString(input);
		String[] words = retVal.split(" ",0);
		for(int i = 0; i < words.length; i++ )
		{
			IndexIntoList = randy.nextInt(VerbToUse.size());
			if(words[i].contains("<verb>"))
			{
				words[i]= VerbToUse.get(IndexIntoList);
			}
		}
		retVal = String.join(" ", words);
		return retVal;
	}

}
