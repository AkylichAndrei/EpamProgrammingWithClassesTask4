package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;
//https://www.geeksforgeeks.org/association-composition-aggregation-java/
//Reader Ticket 
//Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
//����� � �������:
//a) ������ ���� ��������� ������;
//b) ������ ����, ���������� �������� �������������;
//c) ������ ����, ���������� ����� ��������� ����.
 class LibraryCard  
{ 
    private int idCard;
    private String name;//��� ���������
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
	            "���� ='" + id + '\'' +
	            ", �������� ����� =" + name +
	            ", ����� ='" + author + '\'' +
	            ", ������������ ='" + publisher + '\'' +
	            ", ��� ������� ='" + yearOfPublication + '\'' +
	            ", ���������� �������='" + numberOfPages + '\'' +
	            ", ���� ='" + price + '\'' +
	           ",  ��� ��������� ='" + typeOfBinding + '\'' +
	            '}';
				
		}
	
	public static void main(String[] args) {
		Book objBook = new Book(1001,"����� ������ � ����������� ������","����� �. �������","������������ 1",1956,215,2000,"������ �������");
		Book objBook1 = new Book(1002,"����� ������ � ������ �������","����� �. �������","������������ 2",1957,225,2050,"������ �������");
		Book objBook2 = new Book(1003,"����� ������ � ����� ����","����� �. �������","������������ 1",1958,230,3000,"������ �������");
		
		Book objBook3 = new Book(1004,"������ ����","������ ����","������������ 9",1959,240,4000,"������ �������");
		Book objBook4 = new Book(1005,"���� �����-������","�������� ����","������������ 9",1960,250,4000,"������  �������");
		
		Book objBook5 = new Book(1006,"����� ������ � ���� ������ ����� 1","����� �. �������","������������ 4",1970,260,3000,"������ �������");
		Book objBook6 = new Book(1007,"����� ������ � ���� ������ ����� 2","����� �. �������","������������ 4",1980,270,6000,"������ �������");
		//������ ������ ���� ��� �� ������� ��� � ������������ �����
		List <Book> bookList2 = new ArrayList<Book>();
		bookList2.add(objBook);
		bookList2.add(objBook1);
		
		LibraryCard objLibraryCard = new LibraryCard(101,"������",bookList2);
		 System.out.println("������� ��� �������� :"+objLibraryCard.getName());
		 System.out.println("������� ����� �������� :"+objLibraryCard.getBooks());
		    
		//������ ������ ���� �����
		 List <Book> bookList = new ArrayList<Book>();
		 bookList.add(objBook);
		 bookList.add(objBook1);
		 bookList.add(objBook2);
		 bookList.add(objBook3);
		 bookList.add(objBook4);
		 bookList.add(objBook5);
		 bookList.add(objBook6);
		 
	    System.out.println("-------������ ���� ������ ����� �. ������� -----");
	    for (Book u : bookList) {
	    	if(u.author=="����� �. �������")
	        System.out.println(u);
	    }
	    System.out.println("-------������ ���� ���������� ������������ 9 -----");
	    for (Book u : bookList) {
	    	if(u.publisher=="������������ 9")
	        System.out.println(u);
	    }
	    System.out.println("-------������ ���� ���������� ����� 60-�� -----");
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
