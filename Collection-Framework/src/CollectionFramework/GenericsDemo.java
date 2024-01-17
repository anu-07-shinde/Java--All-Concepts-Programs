package CollectionFramework;

public class GenericsDemo <E>{
	
	private static final int Student = 0;
	E[] arr;
	
	public GenericsDemo(int size)
	{
		arr = (E[]) new Object[size];
	}
	

	public static void main(String[] args) {
//		
//		GenericsDemo<Integer> x = new GenericsDemo<>(10);
//		System.out.println(x);
		
		
		GenericsDemo<Student> tt = new GenericsDemo(Student);
		tt.arr[1] = new Student("Anu", 90, 16650);

	}

}
