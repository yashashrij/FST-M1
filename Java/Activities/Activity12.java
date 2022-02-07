package activities;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));
 
        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
	}
	
	interface Addable {
	    int add(int a, int b);
	}

}
