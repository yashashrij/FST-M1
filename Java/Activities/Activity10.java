package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("Rose");
		hs.add("Lotus");
		hs.add("Jasmine");
		hs.add("Lily");
		hs.add("Marigold");
		hs.add("Sunflower");
		
		System.out.println("Actual Set:" +hs);
		System.out.println("Size of Set:" +hs.size());
		
		System.out.println(hs.remove("Lily"));
		
		System.out.println(hs.remove("Daisy"));//returns false if item is not present in set
		
		System.out.println(hs.contains("Rose"));// returns true if item is present
		
		System.out.println("Updated set:" +hs);// should not contain removed item
		
		System.out.println("Size after removing item:" +hs.size());
		
	}

}
