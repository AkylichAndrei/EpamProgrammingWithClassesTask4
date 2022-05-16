// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
// (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность 
// вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
package simpleClass_Tasks1;
import java.util.Scanner;

public class Students {
	private String firstName; // Имя
	private String middleName;// Отчество
	private String lastName;  // Фамилия
	private long groupNumber;  // номер группы
	public int[] academicPerformance = new int[5]; //успеваемость
	Students(String fN, String mN, String lN, long gN) {
		this.setFirstName(fN);
		this.setMiddleName(mN);
		this.setLastName(lN);
		this.setGroupNumber(gN);
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
	public long getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(long groupNumber) {
		this.groupNumber = groupNumber;
	}
	public static void main(String[] args) {
	 Students[] stud = new Students[9];
	 String fN,mN,lN;
	 long gN;
	 int	sumAP = 0;
	 Scanner in = new Scanner(System.in);
	 for(int i = 0; i < stud.length; i++) {
		System.out.println("Нажмите Enter, если готовы... ");
		in.nextLine();
		System.out.println("Введите имя студента: ");
		fN = in.nextLine();
		System.out.println("Введите отчество студента: ");
		mN = in.nextLine();
		System.out.println("Введите фамилию студента: ");
		lN = in.nextLine();
		System.out.println("Введите номер группы: ");
		gN = in.nextLong();
		stud[i] = new Students(fN,mN,lN,gN);
		for(int j = 0; j < 5; j++) {
			System.out.println("Введите оценку студента номер: " + (j+1));
			stud[i].academicPerformance[j]= in.nextInt();
		}
	 }
	 in.close();
	 for(int j = 0; j< stud.length; j++) {
			for(int i = 0; i < 5; i++) {
			 	sumAP += stud[j].academicPerformance[i];
			}
			if(sumAP >= 45){
			System.out.println(" ===================================" );
			System.out.println(" Найден студент отличник: " + stud[j].getLastName());
			System.out.println(" Номер группы студента отличника: " + stud[j].getGroupNumber());
			}
			sumAP =0;
			}
	 System.out.println(" ===================================" );
	 }
}