import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenge2
	{

		public static void main(String[] args)
			{
			//Question 1 code...
				ArrayList <String> dogs = new ArrayList <String>();
					dogs.add("Border Collie");
					dogs.add("Blue Healer");
					dogs.add("Golden Reterver");
					dogs.add("Gray Hound");
					dogs.add("Jack Russle Terrior");
					dogs.add("German Shepherd");
					dogs.add("Old English Shepherd");
					dogs.add("Bernese Mountain Dog");
					dogs.add("Corgie");
					dogs.add("Mutt");
					
			//Question 2 code...
					Collections.sort(dogs);
					
					for (String d : dogs)
						{
							System.out.println(d);
						}
					
					System.out.println(" ");
					
			//Question 3 code...
					System.out.println(dogs.get(0));
					System.out.println(dogs.get(9));
					
					System.out.println(" ");
					
			//Question 4 code...
					for ()
						{
							System.out.println();
						}
					System.out.println(" ");
					
			//Question 5 code...
					System.out.println("Mutt");
						
			}
		

	}
