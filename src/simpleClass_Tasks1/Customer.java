package simpleClass_Tasks1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//https://www.geeksforgeeks.org/association-composition-aggregation-java/ Ресурс
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

	//==========Чек====================
	 //агрегирующий класс чек 
	 class Сheck{
			private int checkNumber;
			private String nameOfProduct;
			private int price;
			private int idCustomer;//cвязь с покупателем будем осуществлять через идентификационный номер
			
			Сheck(int cN, String nOP, int p, int iC){
				this.setCheckNumber(cN);
				this.setNameOfProduct(nOP);
				this.setPrice(p);
				this.setIdCustomer(iC);
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public int getCheckNumber() {
				return checkNumber;
			}
			public void setCheckNumber(int checkNumber) {
				this.checkNumber = checkNumber;
			}
			public String getNameOfProduct() {
				return nameOfProduct;
			}
			public void setNameOfProduct(String nameOfProduct) {
				this.nameOfProduct = nameOfProduct;
			}
			public int getIdCustomer() {
				return idCustomer;
			}
			public void setIdCustomer(int idCustomer) {
				this.idCustomer = idCustomer;
			}
		
		
		}
	 
	 public class Customer implements Comparable <Customer>{//добавляем возможность сравнивать объекты User{
			
			
			//==========Покупатель====================
			//агрегирующий класс содержит в себе другие классы
			private int id; 
			private String firstName; // Имя
			private String middleName;// Отчество
			private String lastName;  // Фамилия
			private String address; 
			private long creditCardNumber; 
			private int bankAccountNumber;
			// класс покупатель содержит список чеков за покупки
			private List<Сheck> cheks;
			
			Customer(int id, String fN,String mN,String lN, String adress, long cCN, int bAN, List<Сheck> cheks){
				this.setId(id);
				this.setFirstName(fN);
				this.setMiddleName(mN);
				this.setLastName(lN);
				this.setAddress(adress);
				this.setCreditCardNumber(cCN);
				this.setBankAccountNumber(bAN);
				this.cheks = cheks;
			}
			 public List<Сheck> getCheks()  
			    { 
			        return cheks; 
			    } 
			   @Override
			 //реализуем метод compareTo интерфейса Comparable
			     public int compareTo(Customer o) {

				   
			 //используем метод compareTo из класса String для сравнения имен
			         int result = this.firstName.compareTo(o.firstName);

			 //если имена одинаковые -  сравниваем возраст,
			// используя метод compareTo из класса String

			         if (result == 0) {
			             result = this.middleName.compareTo(o.middleName);
			         }
			         return result;
			     }
			
			 @Override
			public String toString() {
				String s="";
				  for (int i=0; i < cheks.size(); i++)
			        {
			            s = s + cheks.get(i).getNameOfProduct()+" ";
			        }
					 return "{" +
		            "Айди ='" + id + '\'' +
		            ", Имя =" + firstName +
		            ", Отчество ='" + middleName + '\'' +
		            ", Фамилия ='" + lastName + '\'' +
		            ", Адресс ='" + address + '\'' +
		            ", Номер карточки='" + creditCardNumber + '\'' +
		            ", Номер счёта ='" + bankAccountNumber + '\'' +
		            ", Список покупок ='" + s  + '\'' +
		            '}';
					
			}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getCreditCardNumber() {
			return creditCardNumber;
		}
		public void setCreditCardNumber(long creditCardNumber) {
			this.creditCardNumber = creditCardNumber;
		}
		public int getBankAccountNumber() {
			return bankAccountNumber;
		}
		public void setBankAccountNumber(int bankAccountNumber) {
			this.bankAccountNumber = bankAccountNumber;
		}
	public static void main(String[] args) {
		
	//создаём чеки на покупку 
		Сheck objCheck1 = new Сheck(10001,"  Porsche 718 Cayman",5_680_000,0);
		Сheck objCheck2 = new Сheck(10002,"  Porsche 911 Carrera",7_226_000,0);
		Сheck objCheck3 = new Сheck(10003,"  Porsche 911 Carrera Cabriolet",8_050_000,1);
		Сheck objCheck4 = new Сheck(10004,"  Porsche 718 Boxster",5_609_000,2);
		Сheck objCheck5 = new Сheck(10005,"  Porsche Panamera Sport Turismo",7_121_000,3);
		Сheck objCheck6 = new Сheck(10006,"  Porsche 911 GT2 RS",19_245_000,4);
		
		//создаём списки чеков для каждго покупателя
		 List <Сheck> zero_customer = new ArrayList<Сheck>(); 
		 zero_customer.add(objCheck1); 
		 zero_customer.add(objCheck2);
		 List <Сheck> one_customer = new ArrayList<Сheck>(); 
		  one_customer.add(objCheck3);
		 List <Сheck> two_customer = new ArrayList<Сheck>(); 
		 two_customer.add(objCheck4);
		 List <Сheck> three_customer = new ArrayList<Сheck>(); 
		 three_customer.add(objCheck5);
		 List <Сheck> four_customer = new ArrayList<Сheck>(); 
		 four_customer.add(objCheck6);
		 
		 
		//создаём покупателей и присваеваем им чеки покупок
		Customer objectCustomer = new Customer(0,"Андрей","Викторович","Акулич","ул.Янковского 34-124",287834341,34124,zero_customer);
		Customer objectCustomer1 = new Customer(1,"Сергей","Викторович","Бабулич","ул.Шарангович 37-125",927834341,14124,one_customer);
		Customer objectCustomer2 = new Customer(2,"Павел","Викторович","Пампулич","ул.Горецкого 56-54",347834341,24124,two_customer);
		Customer objectCustomer3 = new Customer(3,"Александр","Викторович","Куркулич","ул.Бурдейного 12-64",657834341,54124,three_customer);
		Customer objectCustomer4 = new Customer(4,"Андрей","Алексеевич","Дикулич","ул.Программистов 65-124",117834341,74124,four_customer);

		
		List<Customer> list = new ArrayList<>();

		    list.add(objectCustomer);
		    list.add(objectCustomer1);
		    list.add(objectCustomer2);
		    list.add(objectCustomer3);
		    list.add(objectCustomer4);
		    System.out.println("-------до сортировки --------");
		    for (Customer u : list) {
		    	
		        System.out.println(u);
		    }
		    System.out.println("-------после сортировки -----");
		    Collections.sort(list);
		    for (Customer u : list) {
		    	
		        System.out.println(u);

		    }
		    System.out.println("-------диапазон карточки от 0 до 347834342-----");
	
		    for (Customer u : list) {
		    	if(u.getCreditCardNumber() > 0 && u.getCreditCardNumber() < 347834342)
		        System.out.println(u);
		    }
		    
	}
	
	

}
