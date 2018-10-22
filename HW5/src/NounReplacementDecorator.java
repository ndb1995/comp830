import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NounReplacementDecorator implements MadLibsDecorator {

	private ArrayList<String> NounToUse = new ArrayList<String>();
	int IndexIntoList;
	
	MadLibsDecorator mlDecorator;
	Random randy = new Random();
	
	// I load a file into this to give it more variation
	File file = new File("nouns.txt"); 
	
	NounReplacementDecorator(MadLibsDecorator mld) throws FileNotFoundException{
		Scanner s = new Scanner(file);
		while (s.hasNext()){
			NounToUse.add(s.next());
		}
		s.close();
		
		this.mlDecorator = mld;
	}
	
	@Override
	public String decorateString(String input) {
		// this will return the string currently stored in the decorator object so that we can apply logic on it
		String retVal = mlDecorator.decorateString(input);
		String[] words = retVal.split(" ",0);
		for(int i = 0; i < words.length; i++ )
		{
			IndexIntoList = randy.nextInt(NounToUse.size());
			if(words[i].contains("<noun>"))
			{
				words[i]= NounToUse.get(IndexIntoList);
			}
		}
		retVal = String.join(" ", words);
		return retVal;
	}
	
	

}
