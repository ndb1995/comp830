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
		BookInformation b6 = new BookInformation("Leo Tolstoy","Anna Karenina","1877",
				"The plot centers on an extramarital affair between Anna and dashing cavalry officer Count Alexei Kirillovich Vronsky that scandalizes the social circles of Saint Petersburg and forces the young lovers to flee for Italy in a futile search for happiness. Returning to Russia, their lives further unravel.");
		bookInformation.add(b6);
		BookInformation b7 = new BookInformation("Hermin Melville","Moby Dick","1851",
				"The book is sailor Ishmael's narrative of the obsessive quest of Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, the white whale that on the ship's previous voyage bit off Ahab's leg at the knee.");
		bookInformation.add(b7);
		BookInformation b8 = new BookInformation("Leo Tolstoy","War and Peace","1867",
				"The novel chronicles the history of the French invasion of Russia and the impact of the Napoleonic era on Tsarist society through the stories of five Russian aristocratic families.");
		bookInformation.add(b8);
		BookInformation b9 = new BookInformation("Aldous Huxley","Brave New World","1932",
				" Largely set in a futuristic World State of genetically modified citizens and an intelligence-based social hierarchy, the novel anticipates huge scientific developments in reproductive technology, sleep-learning, psychological manipulation, and classical conditioning that are combined to make a utopian society that goes challenged only by a single outsider.");
		bookInformation.add(b9);
		BookInformation b10 = new BookInformation("Ernst Junger","Storm of Steel","1924",
				"the memoir of German officer Ernst Jünger's experiences on the Western Front during the First World War.");
		bookInformation.add(b10);
		
		BookInformation b11 = new BookInformation("Franz Kafka","The Trial","1925",
				"it tells the story of Josef K., a man arrested and prosecuted by a remote, inaccessible authority, with the nature of his crime revealed neither to him nor to the reader.");
		bookInformation.add(b11);
		BookInformation b12 = new BookInformation("Miguel De Cervantes","Don Quixote","1615",
				"The story follows the adventures of a noble (hidalgo) named Alonso Quixano who reads so many chivalric romances that he loses his sanity and decides to become a knight-errant (caballero andante), reviving chivalry and serving his country, under the name Don Quixote de la Mancha.");
		bookInformation.add(b12);
		BookInformation b13 = new BookInformation("Dante Alighieri","The Divine Comedy","1320",
				"The narrative describes Dante's travels through Hell, Purgatory, and Paradise or Heaven,[4] while allegorically the poem represents the soul's journey towards God.");
		bookInformation.add(b13);
		BookInformation b14 = new BookInformation("Seneca","Moral Letters to Lucilius","0065",
				" is a collection of 124 letters which were written by Seneca the Younger at the end of his life, during his retirement, and written after he had worked for the Emperor Nero for more than ten years.");
		bookInformation.add(b14);
		BookInformation b15 = new BookInformation("St. Augustine","The Confessions","0400",
				"The work outlines Saint Augustine's sinful youth and his conversion to Christianity.");
		bookInformation.add(b15);
		BookInformation b16 = new BookInformation("George Orwell","1984","1949",
				" The novel is set in the year 1984 when most of the world population have become victims of perpetual war, omnipresent government surveillance and propaganda.");
		bookInformation.add(b16);
		BookInformation b17 = new BookInformation("Alexis de Tocqueville","Democracy in America","1840",
				"In the book, Tocqueville examines the democratic revolution that he believed had been occurring over the previous several hundred years.");
		bookInformation.add(b17);
		BookInformation b18 = new BookInformation("Tacitus","Annals","0068",
				"is a history of the Roman Empire from the reign of Tiberius to that of Nero, the years AD 14–68.");
		bookInformation.add(b18);
		BookInformation b19 = new BookInformation("Victor Hugo","Les Misérables","1862",
				"the novel follows the lives and interactions of several characters, particularly the struggles of ex-convict Jean Valjean and his experience of redemption.");
		bookInformation.add(b19);
		BookInformation b20 = new BookInformation("Alexandre Dumas","The Count of Monte Cristo","1845",
				"The story takes place in France, Italy, and islands in the Mediterranean during the historical events of 1815–1839: the era of the Bourbon Restoration through the reign of Louis-Philippe of France.");
		bookInformation.add(b20);
	}
	
	// once we find out the strategy is not null, we must execute the strategy
	public void setStrategy(BookStrategy bs) {
		this.bs = bs;
		if(bs != null) {
			bs.sort(getBookInformation());
		}
	}
	
	private ArrayList<BookInformation> getBookInformation(){
		return bookInformation;
	}
}
