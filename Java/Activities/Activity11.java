package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hsMap = new HashMap<Integer, String>();
		hsMap.put(1, "Green");
		hsMap.put(2, "Blue");
		hsMap.put(3, "Red");
		hsMap.put(4, "Yellow");
		hsMap.put(5, "Pink");
		
		
        System.out.println("The Actual map: " + hsMap);

        hsMap.remove(4);
       
        System.out.println("After removing Yellow: " + hsMap);
        
        
        if(hsMap.containsValue("Green")) {
            System.out.println("Green prsent in the Map");
        } else {
            System.out.println("Green does not prsent in the Map");
        }
        
        
        System.out.println("Number of pairs in the Map is: " + hsMap.size());
    }

	}


