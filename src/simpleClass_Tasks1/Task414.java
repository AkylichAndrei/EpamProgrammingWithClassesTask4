package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Счета. Клиент может иметь несколько счетов в банке.
//Учитывать возможность блокировки/разблокировки счета. 
//Реализовать поиск и сортировку счетов.
//Вычисление общей суммы по счетам.
//Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
class Client implements Comparable <Client>{//добавляем возможность сравнивать объекты
	private int idClient;
	private String name;
	private List<Account> account;
	Client(int idClient, String name, List<Account> account ){
		this.setIdClient(idClient);
		this.setName(name);
		this.account=account;
	}
	//Реализуем поиск 
	public void searchAccountNumber(int aN) {
		 for(int i = 0; i < account.size(); i++) 
			 if (account.get(i).getNumber()==aN) {
				 System.out.println("Найдена аккаунт с таким номером: "+account.get(i).getNumber()+ 
						 " Его владелец "+this.getName());;
			 }
	}
	//Реализуем сортировку по фамилии
	  @Override
		 //реализуем метод compareTo интерфейса Comparable
		     public int compareTo(Client o) {
		          int   result = this.name.compareTo(o.name);
		         return result;
		     }
		 @Override
		public String toString() {
			String s="";
			  for (int i=0; i < account.size(); i++)
		        {
		            s = s + " Номер аккаунта: "+account.get(i).getNumber()+" || Cумма а счёте: "+
		        account.get(i).getBalance()+" ||| ";
		        }
				 return "{" +
	            "Айди ='" + idClient + '\'' +
	            ", Имя =" + name +
	            ", Список счетов = ||'" + s  + '\'' +
	            '}';
		}
		//Вычисление общей суммы по счетам.
		 public int allSummAccounts() {
			 int allSumm=0;
			 for(int i = 0; i < account.size(); i++) 
				 allSumm = allSumm + account.get(i).getBalance();
				return allSumm;
		 }
		public int positiveAmountAccounts() {
			int allSumm=0;
			 for(int i = 0; i < account.size(); i++) 
				if(account.get(i).getBalance()>0) 
					allSumm = allSumm + account.get(i).getBalance();
				return allSumm;
		}
		public int negativeAmountAccounts() {
			int allSumm=0;
			 for(int i = 0; i < account.size(); i++) 
				if(account.get(i).getBalance()<0) 
					allSumm = allSumm + account.get(i).getBalance();
				return allSumm;
		}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAccount() {
		return account;
	}
}
class Account{
	private int number;
	private int balance; //возможность блокировки/разблокировки
	private boolean blocking;
	Account(int number, int balance, boolean blocking){
		this.setNumber(number);
		this.setBalance(balance);
		this.setBlocking(blocking);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isBlocking() {
		return blocking;
	}
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
}
public class Task414 {
	public static void main(String[] args) {
		//создадим счета
		Account objAcc = new Account(10002,5_000,true);
		Account objAcc2 = new Account(10001,-5__000,true);
		Account objAcc3 = new Account(10003,7_000,true);
		Account objAcc4 = new Account(10004,9_000,true);
		Account objAcc5 = new Account(10005,1_000,true);
		Account objAcc6 = new Account(10007,-9_000,false);
		Account objAcc7 = new Account(10006,500,false);
		//создадим списки счетов
	 	List<Account> listAccount = new ArrayList<>();
	 	listAccount.add(objAcc);
	 	listAccount.add(objAcc2);
	 	List<Account> listAccount2 = new ArrayList<>();
	 	listAccount2.add(objAcc3);
	 	listAccount2.add(objAcc4);
	 	List<Account> listAccount3 = new ArrayList<>();
	 	listAccount3.add(objAcc5);
	 	listAccount3.add(objAcc6);
	 	listAccount3.add(objAcc7);
	 	//создадим клиентов
	 	Client objClient = new Client(1001,"Акулич Андрей Викторович",listAccount);
	 	Client objClient3 = new Client(1003,"Позняк Алексей Игоревич",listAccount3);
	 	Client objClient2 = new Client(1002,"Утиков сергей Нузеркулович",listAccount2);
	 	//объеденим всех клиенов для удобства
	 	List<Client> listClients = new ArrayList<>();
	 	listClients.add(objClient);
	 	listClients.add(objClient2);
	 	listClients.add(objClient3);
	 	//Реализуем поиск 
	 	System.out.println("===== Задание 1 =====");
	 	System.out.println("===== попробуем найти клиента с номером счёта 10006");
	    for (Client u : listClients) {
	       u.searchAccountNumber(10006);
	    }
	    System.out.println("===== Задание 2 =====");
	    System.out.println("===== до сортировки по фамилии=====");
	    for (Client u : listClients) {
	        System.out.println(u);
	    }
	    System.out.println("===== после сортировки по фамилии =====");
	    Collections.sort(listClients);
	    for (Client u : listClients) {
	        System.out.println(u);
	    }
	    System.out.println("===== Задание 3 =====");
	    int summ=0;
        for (Client u : listClients)
	    	summ = summ + u.allSummAccounts();
	    System.out.println("Общая сумма по аккаунтам "+ summ);
	    System.out.println("===== Задание 4 =====");
	    int positiveAmount=0;
	    int negativeAmount=0;
	    for (Client u : listClients) 
	    	positiveAmount = positiveAmount + u.positiveAmountAccounts();
	    for (Client u : listClients) 
	    	negativeAmount = negativeAmount + u.negativeAmountAccounts();
	    System.out.println("Общая сумма положительных денег "+ positiveAmount);
	    System.out.println("Общая сумма отрицательных денег"+ negativeAmount);
	}
}