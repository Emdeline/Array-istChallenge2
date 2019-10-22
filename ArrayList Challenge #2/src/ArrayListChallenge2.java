import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenge2
	{
		static ArrayList <String> dogs = new ArrayList <String>();
		
		public static void main(String[] args)
			{
				list();
				printList();
				questionTwo();
				questionThree();
				questionFour();
				longest();
				shortest();
				
		
			}
		//Question 1 code...
			//names/initiates an array
		
		public static void list()
			{
				dogs.add("Border Collie");
				dogs.add("Blue Healer");
				dogs.add("Pit Bull");
				dogs.add("Gray Hound");
				dogs.add("Jack Russle Terrior");
				dogs.add("German Shepherd");
				dogs.add("Old English Shepherd");
				dogs.add("Bernese Mountain Dog");
				dogs.add("Corgie");
				dogs.add("Mutt");
			}
		
		public static void printList()
			{
				for (String d : dogs)
					{
						System.out.println(d);
					}
				System.out.println(" ");
			}
		
			//Question 2 code...
					//Sorts the array into alphabetical order
		
		public static void questionTwo()
			{
				Collections.sort(dogs);
				printList();
				System.out.println(" ");
			}
		
			//Question 3 code...
				//Pulls the first thing in the array (the first dog) and pulls the last thing in the array (the last dog)
			
		public static void questionThree()
			{
				System.out.println(dogs.get(0));
				System.out.println(dogs.get(9));
					
				System.out.println(" ");
			}
		
			//Question 4 code...
				//Takes out word that starts with the most common letter in the array, in this case its the letter "b" so it takes at all of the type of dog that starts with a "b", then prints out the new array
		public static void questionFour()
			{
				for (int i = dogs.size()-1; i >= 0; i--)
					{
						String frontLetter = dogs.get(i).substring(0, 1);	

							if (frontLetter.equals("B"))
								{
									dogs.remove(i);
								}
					}
					printList();
					System.out.println(" ");
					
			}		
						
			//Question 5 code...
				//Prints out the type of dog that has the least amount of letters in it's name and also prints out the type of dog that has the most letter in it's name
		
		public static void longest() 
			{
				int index = 0;
				int max = dogs.get(0).length();
					for (int d = 0; d < dogs.size(); d++)
						{
							if (dogs.get(d).length() > max)
								{
									max = dogs.get(d).length();
									index = d;
								}
							
						}
					
					System.out.println(dogs.get(index));
			}
			
		
		public static void shortest() 
			{
				int index = 0;
				int max = dogs.get(0).length();				
					for (int g = 0; g < dogs.size(); g++)
						{
							if(dogs.get(g).length() < max)
								{
									max = dogs.get(g).length();
									index = g;
								}
						}
					
					System.out.println(dogs.get(index));
			}				
					
	}
