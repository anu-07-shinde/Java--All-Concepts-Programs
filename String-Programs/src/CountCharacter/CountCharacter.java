package CountCharacter;

public class CountCharacter {

	public static void main(String[] args) {
		
		String name = "Anuradha Shinde";
		
		System.out.println("Name: "+name);
		int count=0;
		
//		System.out.print("Count: ");
		for(int i=0; i<name.length();i++)
			{
				if(name.charAt(i) != ' ')
				{
					count++;
				}
			}
			
			System.out.println("Count: "+count);
		}
		
	}

