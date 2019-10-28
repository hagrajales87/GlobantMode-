package RunStructure;

import java.util.*;

import Structure.Glober;
import Structure.Lead;
import Structure.Senior;
import Structure.Junior;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int option;
			
		ArrayList <Glober> globers = new ArrayList<Glober>();
		
		Glober globerOne = new Glober("Liliana",3800000,true);	
		Lead leadOne = new Lead("Andres",6800000,true);
		Senior seniorOne= new Senior("Juan",5000000,true);
		Junior juniorOne = new Junior("Sergio",2600000,false);
		
		globers.add(globerOne);
		globers.add(leadOne);
		globers.add(seniorOne);
		globers.add(juniorOne);
		
		for(Glober i: globers) {
			System.out.println(i.globerInformation());
		}
		
		System.out.println(leadOne.LeadPeople());
		
		option=read.nextInt();
		switch(option) {
		
	
		case 1: System.out.println("Your current money is: ");
				break;
		}

		
		}
	
	

}
