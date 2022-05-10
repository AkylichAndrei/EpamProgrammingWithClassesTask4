package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ������������� �������. 
// ������������ ����� ����������� ������� �� ������ ������������� ������� ���������� ���� 
// (�����, ���������, �������, ������, ����� � �. �.) ��� ������������ ������.
// ��������� ����������� ������ ����������, ������� � ����� ����. 
// ����������� ����� � ���������� �������.
class Offer implements Comparable <Offer>{
	private String name;
	private List<Voucher> vouchers;
	Offer(String name,List<Voucher> vouchers){
		this.setName(name);
		this.vouchers = vouchers;
	} 
	//��������� ���������� �� �������
	  @Override
		 //��������� ����� compareTo ���������� Comparable
		     public int compareTo(Offer o) {

		          int   result = this.name.compareTo(o.name);
		         return result;
		     }
		
		 @Override
		public String toString() {
			String s="";
			  for (int i=0; i < vouchers.size(); i++)
		        {
		            s = s + " |=|=| ����� ������: "
		            		+ ""+vouchers.get(i).getNumber()+" "
		            				+ "|| ���������: "
		            				+ ""+vouchers.get(i).getTransport()+" |||"
		            						+ "|| �������: "
				            				+ ""+vouchers.get(i).getFood()+" |||"
				            						+ "|| ����� ���� ����������: "
						            				+ ""+vouchers.get(i).getNumberOfDays()+" |||"
						            						+ "|| ��� �����������: "
								            				+ ""+vouchers.get(i).getType()+" |=|=|"
		            						+ " ";
		        }
				 return "{" +
	            "�������� ����������� :'" + name + '\'' +
	            ", ������ ������ ��� ����������� : ||'" + s  + '\'' +
	            '}';
		}
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Voucher{
	private int number;
	private String country;
	private String transport;
	private String food;
	private int numberOfDays;
	private String type;
	Voucher(int number,String country,String transport,String food,int numberOfDays,String type){
		this.setNumber(number);
		this.setCountry(country);
		this.setTransport(transport);
		this.setFood(food);
		this.setNumberOfDays(numberOfDays);
		this.setType(type);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
public class Task415 {
	public static void main(String[] args) {
		Voucher objVoucer = new Voucher(390001,"����������","������������ AzurAir","All inclusive",30,"�����");
		Voucher objVoucer1 = new Voucher(390002,"��������","������������ AzurAir","All inclusive",30,"�����");
		Voucher objVoucer2 = new Voucher(390003,"�������","������������ �������","HB",15,"�����");
		Voucher objVoucer3 = new Voucher(390004,"��������","������������ �������","HB",9,"�������");
		Voucher objVoucer4 = new Voucher(390005,"�������","������������ AzurAir","All inclusive",30,"�������");
		Voucher objVoucer5 = new Voucher(390006,"������","������������ ��������","All inclusive",10,"���������");
		Voucher objVoucer6 = new Voucher(390007,"������","������������ ��������","All inclusive",15,"���������");
		Voucher objVoucer7 = new Voucher(390006,"�������","������������ ��������","HB",10,"������");
		Voucher objVoucer8 = new Voucher(390007,"�������","������������ ��������","HB",15,"������");
		Voucher objVoucer9 = new Voucher(390008,"����������","������������ ��������","All inclusive",10,"�����");
		Voucher objVoucer10 = new Voucher(390009,"��������","������������ ��������","All inclusive",15,"�����");
		// (�����, ���������, �������, ������, ����� � �. �.)
		//��������� ���� ������� ��� ��������
	 	List<Voucher> relaxationVouchers = new ArrayList<>();
	 	relaxationVouchers.add(objVoucer);
	 	relaxationVouchers.add(objVoucer1);
	 	relaxationVouchers.add(objVoucer2);
		
		List<Voucher> excursionsVouchers = new ArrayList<>();
		excursionsVouchers.add(objVoucer3);
		excursionsVouchers.add(objVoucer4);
		
		List<Voucher> treatmentVouchers = new ArrayList<>();
		treatmentVouchers.add(objVoucer5);
		treatmentVouchers.add(objVoucer6);
		
		List<Voucher> shoppingVouchers = new ArrayList<>();
		shoppingVouchers.add(objVoucer7);
		shoppingVouchers.add(objVoucer8);
		
		List<Voucher> cruiseVouchers = new ArrayList<>();
		cruiseVouchers.add(objVoucer9);
		cruiseVouchers.add(objVoucer10);
		
		Offer objVoucher1 = new Offer("����������� �� ������", relaxationVouchers);
		Offer objVoucher2 = new Offer("����������� �� ����������", excursionsVouchers);
		Offer objVoucher3 = new Offer("����������� �� ������", treatmentVouchers);
		Offer objVoucher4 = new Offer("����������� �� �������", shoppingVouchers);
		Offer objVoucher5 = new Offer("����������� �� ������", cruiseVouchers);
		List<Offer> listOffer = new ArrayList<>();
		listOffer.add(objVoucher1);
		listOffer.add(objVoucher2);
		listOffer.add(objVoucher3);
		listOffer.add(objVoucher4);
		listOffer.add(objVoucher5);
		//��������� ����� 
	 	System.out.println("===== ������� 1 =====");
	 	System.out.println("===== ������� ��� ����������� �� ����������");
	    for (Offer u : listOffer) {
	    	System.out.println(u);
	    }
	 	System.out.println("===== ������� ��� ����������� ����� ���������� �������� �����������");
	 	Collections.sort(listOffer);
	    for (Offer u : listOffer) {
	    	System.out.println(u);
	    }
	    //��������� 
	 	System.out.println("===== ������� 2 =====");
	 	System.out.println("===== ������� ������� �� ����������, ��� ����������� ������������ AzurAir");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getTransport()=="������������ AzurAir")
	    	System.out.println("������� ������: "+u.getVouchers().get(i).getNumber()+" "
	    			+ ""+u.getVouchers().get(i).getTransport()+" "
	    					+ "������ ���������� "+u.getVouchers().get(i).getCountry());
	    }
	    System.out.println("===== ������� 3 =====");
	 	System.out.println("===== ������� ������� �� ������, ��� ����������� ��� �� ��������");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getFood()=="All inclusive")
	    	System.out.println("������� ������: "+u.getVouchers().get(i).getNumber()+" "
	    			+ "��� �������: "+u.getVouchers().get(i).getFood()+" "
	    					+ "������ ���������� "+u.getVouchers().get(i).getCountry());
	    }
	    System.out.println("===== ������� 4 =====");
	 	System.out.println("===== ������� ������� �� ����� ����, ��� ������� �� 30 ����");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getNumberOfDays()==30)
	    	System.out.println("������� ������: "+u.getVouchers().get(i).getNumber()+" "
	    			+ " ���������� ����: "+u.getVouchers().get(i).getNumberOfDays()+" "
	    					+ "������ ���������� "+u.getVouchers().get(i).getCountry());
	    }
	 
	 
	}

}
