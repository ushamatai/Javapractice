package LinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Book {
	
	int bookId;
	String bookName;
	String author;
	


	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public static void main(String[] args) {
		
		HashMap<Integer, Book> hash= new HashMap<>();
		Book b1=new Book(42, "Kite Runners", "Khaled");
		Book b2=new Book(43, "Happy Times", "Usha");
		hash.put(1, b1);
		hash.put(2, b2);
		
	//	System.out.println(hash.entrySet());
	for(Entry<Integer, Book> m : hash.entrySet())
	{
		int k =m.getKey();
	      Book b=m.getValue();
	      System.out.println(k + "Details are :     ");
	      System.out.println(b.author + b.bookId + b.bookName);
	}
		
	
	//using keyset
	Iterator<Integer> itr =hash.keySet().iterator();
	while(itr.hasNext()) {
		int key=itr.next();
		Book b=hash.get(key);
		System.out.println(b.author + b.bookName + b.bookId);
	}
	
	//using entryset
	for(Entry<Integer,Book> m : hash.entrySet()) {
		m.getKey();
		Book b=m.getValue();
		System.out.println(b.author + b.bookId);
	}
	
	//using lambda
	
	hash.forEach((p,q)->System.out.println(p + q.author +q.bookId));
		
		
		
		
		

	}

	

}
