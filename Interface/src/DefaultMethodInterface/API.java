package DefaultMethodInterface;

public interface API {
	
	default void defaultShow() {
		System.out.println("Default API");
	}
	
	

}

interface Interface1 extends API
{
	void show();
}

interface Interface2 extends API
{
	void print();
}


