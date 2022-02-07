package activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            Activity8.exceptionTest("print to console");
            Activity8.exceptionTest(null); 
            Activity8.exceptionTest("will not execute");
        } catch(CustomException e) {
            System.out.println("Inside a catch block:- " + e.getMessage());
        }
	}
	
	static void exceptionTest(String s) throws CustomException {
        if(s == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(s);
        }
    }

}

class CustomException extends Exception {
    private String msg = null;
 
    public CustomException(String message) {
        this.msg = message;
    }
 
    @Override
    public String getMessage() {
        return msg;
    }
}
 
