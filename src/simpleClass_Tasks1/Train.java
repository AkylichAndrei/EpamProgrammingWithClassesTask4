package simpleClass_Tasks1;

import java.util.Scanner;

public class Train {
	
	private String finalDistination;
	private int trainNumber;
	public int [] startTime = new int[3];
	
	Train(String fD, int tN) {
		this.setFinalDistination(fD);
		this.setTrainNumber(tN);
		
	}
	
	public static void main(String[] args) {
		Train[] objectTrain = new Train[3]; 
		Train[] objectTemp = new Train[1];
		 String fD;
		 int tN;
		 
		 //=======================ввод объекта с клавиатуры
		 Scanner in = new Scanner(System.in);
		for(int i=0; i < objectTrain.length; i++) {
			System.out.println("Нажмите Enter, если готовы... ");
			in.nextLine();
			System.out.println("Введите пунк назначения: ");
			fD = in.nextLine();
			System.out.println("Введите номер поезда: ");
			tN = in.nextInt();
			System.out.println("Введите время отправления Часы/минуты/секунды: ");
			objectTrain[i]= new Train(fD,tN);
			for(int j=0; j < 3; j++)
			objectTrain[i].startTime[j] = in.nextInt();	
		}
		
		
		//=================Сортировка объекта по полям

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < objectTrain.length - 1; i++) 
            	if(objectTrain[i].getTrainNumber()>objectTrain[i + 1].getTrainNumber()) {
            		isSorted = false;
            		objectTemp[0]=objectTrain[i];
					objectTrain[i]=objectTrain[i + 1];
					objectTrain[i + 1]=objectTemp[0];
            }
            
        }
		
      //=================Вывод объекта на экран
		for(int i=0; i < objectTrain.length; i++) {
			
			System.out.println("Пункт назначения " + objectTrain[i].getFinalDistination());
			System.out.println("номер поезда: " + objectTrain[i].getTrainNumber());		
			System.out.println("Время отправления: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			
		}
		
		   //=================Вывод объекта на экран который введёт пользователь
		System.out.println("Введите номер поезда для вывода его на экран: ");
		int tempTN = in.nextInt();
		int buf=0;
		for(int i=0; i < objectTrain.length; i++) {
			if(objectTrain[i].getTrainNumber()==tempTN) {
			buf=1;
			System.out.println("Пункт назначения " + objectTrain[i].getFinalDistination());
			System.out.println("номер поезда: " + objectTrain[i].getTrainNumber());		
			System.out.println("Время отправления: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			}
		}
		if(buf==0)
			System.out.println("Поезд с таким номером не найден! ");
		in.close();
		
		//=================Сортировка объекта по полям и если есть одинаковые элементы по времени 

        isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < objectTrain.length - 1; i++) 
            	
               if((objectTrain[i].getTrainNumber()==objectTrain[i + 1].getTrainNumber())&&(objectTrain[i].startTime[0]>objectTrain[i + 1].startTime[0])) {
            		isSorted = false;
            		objectTemp[0]=objectTrain[i];
					objectTrain[i]=objectTrain[i + 1];
					objectTrain[i + 1]=objectTemp[0];
            	}else if(objectTrain[i].getTrainNumber()>objectTrain[i + 1].getTrainNumber()) {
            		isSorted = false;
            		objectTemp[0]=objectTrain[i];
					objectTrain[i]=objectTrain[i + 1];
					objectTrain[i + 1]=objectTemp[0];
            	}
            
        }
        
        //=================Вывод объекта на экран
        System.out.println("Сортировка объекта по полям и если есть одинаковые элементы по времени! ");
	      for(int i=0; i < objectTrain.length; i++) {
			
			System.out.println("Пункт назначения " + objectTrain[i].getFinalDistination());
			System.out.println("номер поезда: " + objectTrain[i].getTrainNumber());		
			System.out.println("Время отправления: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			
		}
		
	}
	
	public String getFinalDistination() {
		return finalDistination;
	}
	public void setFinalDistination(String finalDistination) {
		this.finalDistination = finalDistination;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	

}
