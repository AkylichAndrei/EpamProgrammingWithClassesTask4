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
		 
		 //=======================���� ������� � ����������
		 Scanner in = new Scanner(System.in);
		for(int i=0; i < objectTrain.length; i++) {
			System.out.println("������� Enter, ���� ������... ");
			in.nextLine();
			System.out.println("������� ���� ����������: ");
			fD = in.nextLine();
			System.out.println("������� ����� ������: ");
			tN = in.nextInt();
			System.out.println("������� ����� ����������� ����/������/�������: ");
			objectTrain[i]= new Train(fD,tN);
			for(int j=0; j < 3; j++)
			objectTrain[i].startTime[j] = in.nextInt();	
		}
		
		
		//=================���������� ������� �� �����

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
		
      //=================����� ������� �� �����
		for(int i=0; i < objectTrain.length; i++) {
			
			System.out.println("����� ���������� " + objectTrain[i].getFinalDistination());
			System.out.println("����� ������: " + objectTrain[i].getTrainNumber());		
			System.out.println("����� �����������: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			
		}
		
		   //=================����� ������� �� ����� ������� ����� ������������
		System.out.println("������� ����� ������ ��� ������ ��� �� �����: ");
		int tempTN = in.nextInt();
		int buf=0;
		for(int i=0; i < objectTrain.length; i++) {
			if(objectTrain[i].getTrainNumber()==tempTN) {
			buf=1;
			System.out.println("����� ���������� " + objectTrain[i].getFinalDistination());
			System.out.println("����� ������: " + objectTrain[i].getTrainNumber());		
			System.out.println("����� �����������: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			}
		}
		if(buf==0)
			System.out.println("����� � ����� ������� �� ������! ");
		in.close();
		
		//=================���������� ������� �� ����� � ���� ���� ���������� �������� �� ������� 

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
        
        //=================����� ������� �� �����
        System.out.println("���������� ������� �� ����� � ���� ���� ���������� �������� �� �������! ");
	      for(int i=0; i < objectTrain.length; i++) {
			
			System.out.println("����� ���������� " + objectTrain[i].getFinalDistination());
			System.out.println("����� ������: " + objectTrain[i].getTrainNumber());		
			System.out.println("����� �����������: "+objectTrain[i].startTime[0]+" / " + objectTrain[i].startTime[1] + " / " + objectTrain[i].startTime[2]);
			
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
