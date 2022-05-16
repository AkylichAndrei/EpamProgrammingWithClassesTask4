package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;
//https://www.geeksforgeeks.org/association-composition-aggregation-java/
//Reader Ticket 
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
 class LibraryCard  
{ 
    private int idCard;
    private String name;//имя владельца
	 private List<Book> books;
      
    LibraryCard (int iC, String name, List<Book> books) 
    { 
   	 this.setIdCard(iC);
   	 this.setName(name);
        this.books = books;  
    } 
    public List<Book> getBooks()  
	    { 
	        return books; 
	    }
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
public class Book {
	//author (s), publisher, year of publication, number of pages, price, type of binding
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int yearOfPublication;
	private int numberOfPages;
	private int price;
	private String typeOfBinding;
	Book(int id, String name, String author, String pub, int yOP, int nOP, int price, String tOB){
		this.setId(id);
		this.setName(name);
		this.setAuthor(author);
		this.setPublisher(pub);
		this.setYearOfPublication(yOP);
		this.setNumberOfPages(nOP);
		this.setPrice(price);
		this.setTypeOfBinding(tOB);
	}
	 @Override
		public String toString() {
			
				 return "{" +
	            "Айди ='" + id + '\'' +
	            ", Название книги =" + name +
	            ", Автор ='" + author + '\'' +
	            ", Издательство ='" + publisher + '\'' +
	            ", Год издания ='" + yearOfPublication + '\'' +
	            ", количество страниц='" + numberOfPages + '\'' +
	            ", цена ='" + price + '\'' +
	           ",  тип переплета ='" + typeOfBinding + '\'' +
	            '}';
				
		}
	public static void main(String[] args) {
		Book objBook = new Book(1001,"Гарри Поттер и философский камень","Джоан К. Роулинг","Издательство 1",1956,215,2000,"Твёрдый переплёт");
		Book objBook1 = new Book(1002,"Гарри Поттер и тайная комната","Джоан К. Роулинг","Издательство 2",1957,225,2050,"Твёрдый переплёт");
		Book objBook2 = new Book(1003,"Гарри Поттер и кубок огня","Джоан К. Роулинг","Издательство 1",1958,230,3000,"Твёрдый переплёт");
		Book objBook3 = new Book(1004,"Зелёная миля","Стивен кинг","Издательство 9",1959,240,4000,"Мягкий переплёт");
		Book objBook4 = new Book(1005,"Граф Монте-Кристо","Александ Дюма","Издательство 9",1960,250,4000,"Мягкий  переплёт");
		Book objBook5 = new Book(1006,"Гарри Поттер и дары смерти Часть 1","Джоан К. Роулинг","Издательство 4",1970,260,3000,"Твёрдый переплёт");
		Book objBook6 = new Book(1007,"Гарри Поттер и дары смерти Часть 2","Джоан К. Роулинг","Издательство 4",1980,270,6000,"Твёрдый переплёт");
		//создаём список книг что бы занечти его в читательский билет
		List <Book> bookList2 = new ArrayList<Book>();
		bookList2.add(objBook);
		bookList2.add(objBook1);
		LibraryCard objLibraryCard = new LibraryCard(101,"Андрей",bookList2);
		 System.out.println("Выведем имя читателя :"+objLibraryCard.getName());
		 System.out.println("Выведем Книги читателя :"+objLibraryCard.getBooks());
		//создаём списки книг общий
		 List <Book> bookList = new ArrayList<Book>();
		 bookList.add(objBook);
		 bookList.add(objBook1);
		 bookList.add(objBook2);
		 bookList.add(objBook3);
		 bookList.add(objBook4);
		 bookList.add(objBook5);
		 bookList.add(objBook6);
	    System.out.println("-------список книг автора Джоан К. Роулинг -----");
	    for (Book u : bookList) {
	    	if(u.author=="Джоан К. Роулинг")
	        System.out.println(u);
	    }
	    System.out.println("-------список книг выпущенных Издательство 9 -----");
	    for (Book u : bookList) {
	    	if(u.publisher=="Издательство 9")
	        System.out.println(u);
	    }
	    System.out.println("-------список книг выпущенных после 60-ых -----");
	    for (Book u : bookList) {
	    	if(u.yearOfPublication>1960)
	        System.out.println(u);
	    }
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTypeOfBinding() {
		return typeOfBinding;
	}
	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}
}