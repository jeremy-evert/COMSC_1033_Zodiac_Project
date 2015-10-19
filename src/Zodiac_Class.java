import java.util.Scanner;
public class Zodiac_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		System.out.print("Enter the number of the month you were born: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month you were born: ");
		int day = input.nextInt();

		System.out.print("\nYou were born in the year of the ");
		

		//for the year
		switch (year % 12){
		case 0: System.out.println("monkey."); break;
		case 1: System.out.println("rooster."); break;
		case 2: System.out.println("dog."); break;
		case 3: System.out.println("pig."); break;
		case 4: System.out.println("rat."); break;
		case 5: System.out.println("ox."); break;
		case 6: System.out.println("tiger."); break;
		case 7: System.out.println("rabbit."); break;
		case 8: System.out.println("dragon."); break;
		case 9: System.out.println("snake."); break;
		case 10: System.out.println("horse."); break;
		case 11: System.out.println("sheep."); 
		}
		
		System.out.print("You are an ");
		
		switch (month){
		case 1: System.out.println("rooster."); break;
		case 2: if (day < 20)	{System.out.println("Aquarius."); break;}
				else			{System.out.println("Pisces."); break;}
		case 3: System.out.println("pig."); break;
		case 4: System.out.println("rat."); break;
		case 5: System.out.println("ox."); break;
		case 6: System.out.println("tiger."); break;
		case 7: System.out.println("rabbit."); break;
		case 8: System.out.println("dragon."); break;
		case 9: System.out.println("snake."); break;
		case 10: System.out.println("horse."); break;
		case 11: System.out.println("sheep."); 
		case 12: System.out.println("monkey."); break;
		}

	}

}
