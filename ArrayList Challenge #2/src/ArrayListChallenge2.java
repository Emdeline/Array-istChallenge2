import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenge2
	{
		static ArrayList <String> dogs = new ArrayList <String>();

		public static void printList()
		{
			for (String d : dogs)
				{
					System.out.println(d);
				}
			
		}
		public static void longest()
			{
				
			}	

		public static void main(String[] args)
			{
			//Question 1 code...
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
					
			//Question 2 code...
					Collections.sort(dogs);
					printList();
					System.out.println(" ");
					
			//Question 3 code...
					System.out.println(dogs.get(0));
					System.out.println(dogs.get(9));
					
					System.out.println(" ");
					
			//Question 4 code...					
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
		//loop through my things you are beatutiful and great and valued deeply

			//Question 5 code...
					int index = 0;
					int max = dogs.get(0).length();
									
					for (int d = 0; d < dogs.size(); d++)
						{
							if(dogs.get(index).length() > max)
								{
									
									index = d;
								}
						}
					System.out.println(dogs.get(index));
					
					int index2 = 0;
					int min = dogs.get(0).length();
									
					for (int d = 0; d < dogs.size(); d++)
						{
							if(dogs.get(index2).length() < min)
								{
									
									index2 = d;
								}
						}
					System.out.println(dogs.get(index2));
								
							
					
			}
		

	}
