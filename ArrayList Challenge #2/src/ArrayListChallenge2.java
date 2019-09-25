import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenge2
	{

		public static void main(String[] args)
			{
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
					dogs.add("Mutt (Mixed Dog)");
					
					Collections.sort(dogs);
					
					for (String d : dogs)
						{
							System.out.println(d);
						}
					System.out.println(dogs.get(0));
					System.out.println(dogs.get(9));

						
			}
		

	}
