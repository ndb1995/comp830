import java.util.ArrayList;

public class BookLibrarian {
	private BookStrategy bs;
	private ArrayList<BookInformation> bookInformation;
	
	BookLibrarian(){
		bookInformation = new ArrayList<BookInformation>();
		
		BookInformation b1 = new BookInformation("Fyodor Dostoevsky","The Brothers Karamazov","1880",
				"The Brothers Karamazov is a passionate philosophical novel set in 19th-century Russia, that enters deeply into the ethical debates of God, free will, and morality.");
		bookInformation.add(b1);
		BookInformation b2 = new BookInformation("Fyodor Dostoevsky","Demons","1872",
				"Demons is an allegory of the potentially catastrophic consequences of the political and moral nihilism that were becoming prevalent in Russia in the 1860s.");
		bookInformation.add(b2);
		BookInformation b3 = new BookInformation("Fyodor Dostoevsky","Crime and Punishment","1867",
				"Crime and Punishment focuses on the mental anguish and moral dilemmas of Rodion Raskolnikov, an impoverished ex-student in Saint Petersburg who formulates a plan to kill an unscrupulous pawnbroker for her money.");
		bookInformation.add(b3);
		BookInformation b4 = new BookInformation("Fyodor Dostoevsky","The Idiot","1869",
				"The title is an ironic reference to the central character of the novel, Prince (Knyaz) Lev Nikolayevich Myshkin, a young man whose goodness, open-hearted simplicity and guilelessness lead many of the more worldly characters he encounters to mistakenly assume that he lacks intelligence and insight.");
		bookInformation.add(b4);
		BookInformation b5 = new BookInformation("Fyodor Dostoevsky","Notes From Underground","1864",
				"The Brothers Karamazov is a passionate philosophical novel set in 19th-century Russia, that enters deeply into the ethical debates of God, free will, and morality.");
		bookInformation.add(b5);
	}
	
	public void setStrategy(BookStrategy bs) {
		this.bs = bs;
	}
	
	public ArrayList<BookInformation> getBookInformation(){
		return bookInformation;
	}
}
