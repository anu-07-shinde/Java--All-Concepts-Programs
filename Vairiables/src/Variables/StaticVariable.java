package Variables;

public class StaticVariable {

		int a = 10;
		static int b = 20;
		
		public static void main(String[] args) {
			
			
			StaticVariable sv = new StaticVariable();
			System.out.println(sv.a);
			System.out.println(StaticVariable.b);
//			System.out.println(sv.b);
		}

	}


