package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Newyork");
		myList.add("Delhi");
		myList.add("Paris");
		myList.add("London");
		myList.add("Berlin");
		
		System.out.println("All Cities are:");
		for(String s:myList) {
			System.out.println(s);
		}
		
		System.out.println(myList.get(3));
		System.out.println(myList.contains("Delhi"));
		System.out.println("Actual List Size:" +myList.size());
		
		myList.remove("Berlin");
		System.out.println("Size after removing item:" +myList.size());
	}

}
