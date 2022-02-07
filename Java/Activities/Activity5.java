package activities;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "New Beginings";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title is: " + newNovel.getTitle());
        
	}
	
	
}

abstract class Book {
    String title;
    abstract void setTitle(String s);// Abstract Method
    
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}
