package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
			public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
			String numD = JOptionPane.showInputDialog(null, "How many dimes do you have?");
			int dimes = Integer.parseInt(numD);
			int cents = dimes* 10;

		// Tell them how many cents they have (hint multiply by 10)
			JOptionPane.showMessageDialog(null, "You have " + cents + " cents.");



		// Ask the user how tall they are (inches)
			String hieght = JOptionPane.showInputDialog(null, "How tall are you in inches?");
			


		// If they are shorter than 36 inches, tell them to eat their Wheaties
			int hei = Integer.parseInt(hieght);
			if(hei <= 36) {
				JOptionPane.showMessageDialog(null, "Eat your wheaties!");
			}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
			for(int i=0;i<31;i+=3) {
				System.out.println(i);
			}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
			Random ran = new Random();
			int randm = ran.nextInt(20);
			
		// Get another random number that is less than 10 and print it to the console 
			
			int rndom = ran.nextInt(10);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
			int num = randm-rndom;
			JOptionPane.showMessageDialog(null, num);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

			String city = JOptionPane.showInputDialog(null, "What city do you live in");

		// If they answered "San Diego", tell them they live in America's Finest City 
			if(city.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City");
			}else {
				JOptionPane.showMessageDialog(null, "Move to San Diego");
			}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
			String cars =  JOptionPane.showInputDialog(null, "How many Cars does your family have");
			int car = Integer.parseInt(cars);

		// If there is 1 car, use a pop-up to display the make/model of the car 
			if(car == 1) {
				JOptionPane.showMessageDialog(null, "Q8 Rs");
			}else {
				int whe = car*4;
				JOptionPane.showMessageDialog(null, whe);
			}

		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 
			String scName =  JOptionPane.showInputDialog(null, "What is your schools name?");
			JOptionPane.showMessageDialog(null, scName + " is a fantastic school.");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
			


		}
		}


