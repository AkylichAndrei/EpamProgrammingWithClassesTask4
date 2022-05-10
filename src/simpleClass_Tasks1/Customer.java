package simpleClass_Tasks1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//https://www.geeksforgeeks.org/association-composition-aggregation-java/ ������
//����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
//����� � �������:
//a) ������ ����������� � ���������� �������;
//b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������

	//==========���====================
	 //������������ ����� ��� 
	 class �heck{
			private int checkNumber;
			private String nameOfProduct;
			private int price;
			private int idCustomer;//c���� � ����������� ����� ������������ ����� ����������������� �����
			
			�heck(int cN, String nOP, int p, int iC){
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
	 
	 public class Customer implements Comparable <Customer>{//��������� ����������� ���������� ������� User{
			
			
			//==========����������====================
			//������������ ����� �������� � ���� ������ ������
			private int id; 
			private String firstName; // ���
			private String middleName;// ��������
			private String lastName;  // �������
			private String address; 
			private long creditCardNumber; 
			private int bankAccountNumber;
			// ����� ���������� �������� ������ ����� �� �������
			private List<�heck> cheks;
			
			Customer(int id, String fN,String mN,String lN, String adress, long cCN, int bAN, List<�heck> cheks){
				this.setId(id);
				this.setFirstName(fN);
				this.setMiddleName(mN);
				this.setLastName(lN);
				this.setAddress(adress);
				this.setCreditCardNumber(cCN);
				this.setBankAccountNumber(bAN);
				this.cheks = cheks;
			}
			 public List<�heck> getCheks()  
			    { 
			        return cheks; 
			    } 
			   @Override
			 //��������� ����� compareTo ���������� Comparable
			     public int compareTo(Customer o) {

				   
			 //���������� ����� compareTo �� ������ String ��� ��������� ����
			         int result = this.firstName.compareTo(o.firstName);

			 //���� ����� ���������� -  ���������� �������,
			// ��������� ����� compareTo �� ������ String

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
		            "���� ='" + id + '\'' +
		            ", ��� =" + firstName +
		            ", �������� ='" + middleName + '\'' +
		            ", ������� ='" + lastName + '\'' +
		            ", ������ ='" + address + '\'' +
		            ", ����� ��������='" + creditCardNumber + '\'' +
		            ", ����� ����� ='" + bankAccountNumber + '\'' +
		            ", ������ ������� ='" + s  + '\'' +
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
		
	//������ ���� �� ������� 
		�heck objCheck1 = new �heck(10001,"  Porsche 718 Cayman",5_680_000,0);
		�heck objCheck2 = new �heck(10002,"  Porsche 911 Carrera",7_226_000,0);
		�heck objCheck3 = new �heck(10003,"  Porsche 911 Carrera Cabriolet",8_050_000,1);
		�heck objCheck4 = new �heck(10004,"  Porsche 718 Boxster",5_609_000,2);
		�heck objCheck5 = new �heck(10005,"  Porsche Panamera Sport Turismo",7_121_000,3);
		�heck objCheck6 = new �heck(10006,"  Porsche 911 GT2 RS",19_245_000,4);
		
		//������ ������ ����� ��� ������ ����������
		 List <�heck> zero_customer = new ArrayList<�heck>(); 
		 zero_customer.add(objCheck1); 
		 zero_customer.add(objCheck2);
		 List <�heck> one_customer = new ArrayList<�heck>(); 
		  one_customer.add(objCheck3);
		 List <�heck> two_customer = new ArrayList<�heck>(); 
		 two_customer.add(objCheck4);
		 List <�heck> three_customer = new ArrayList<�heck>(); 
		 three_customer.add(objCheck5);
		 List <�heck> four_customer = new ArrayList<�heck>(); 
		 four_customer.add(objCheck6);
		 
		 
		//������ ����������� � ����������� �� ���� �������
		Customer objectCustomer = new Customer(0,"������","����������","������","��.���������� 34-124",287834341,34124,zero_customer);
		Customer objectCustomer1 = new Customer(1,"������","����������","�������","��.���������� 37-125",927834341,14124,one_customer);
		Customer objectCustomer2 = new Customer(2,"�����","����������","��������","��.��������� 56-54",347834341,24124,two_customer);
		Customer objectCustomer3 = new Customer(3,"���������","����������","��������","��.���������� 12-64",657834341,54124,three_customer);
		Customer objectCustomer4 = new Customer(4,"������","����������","�������","��.������������� 65-124",117834341,74124,four_customer);

		
		List<Customer> list = new ArrayList<>();

		    list.add(objectCustomer);
		    list.add(objectCustomer1);
		    list.add(objectCustomer2);
		    list.add(objectCustomer3);
		    list.add(objectCustomer4);
		    System.out.println("-------�� ���������� --------");
		    for (Customer u : list) {
		    	
		        System.out.println(u);
		    }
		    System.out.println("-------����� ���������� -----");
		    Collections.sort(list);
		    for (Customer u : list) {
		    	
		        System.out.println(u);

		    }
		    System.out.println("-------�������� �������� �� 0 �� 347834342-----");
	
		    for (Customer u : list) {
		    	if(u.getCreditCardNumber() > 0 && u.getCreditCardNumber() < 347834342)
		        System.out.println(u);
		    }
		    
	}
	
	

}
