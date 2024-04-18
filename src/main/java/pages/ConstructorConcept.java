package pages;

public class ConstructorConcept {
	String name;// Instance variables
	String password;// Instance variables
	String emailid;
	
	// constructor: same user name with class name.
	// constructor: looks like a function but its not a function.
	// constructor: can be overloaded.
	// constructor: can be called when you create the object
	// constructor: will help to initialize the instance/global variables.
	

	public ConstructorConcept(String name, String password, String emailid ) {
	
		this.name = name;
		this.password = password;
		this.emailid = emailid;
		System.out.println("i am login with username, pssword and email");
	}


	public ConstructorConcept(String name, String password) {
	
		this.name = name;
		this.password = password;
		System.out.println("i am login with username and password");
	}


	public static void main(String[] args) {
		
		ConstructorConcept constructorConcept = new ConstructorConcept("veda", "vedapass");
		System.out.println(constructorConcept.name + " " +constructorConcept.password);
		
		ConstructorConcept constructorConcept2 = new ConstructorConcept("veda" , "vedapass", "hsaveda@gmail.com " );
		System.out.println(constructorConcept2.name + " "+ constructorConcept2.password + " "+ constructorConcept2.emailid);
		
		
		
		
		
		
		
		
				
		
	

	}

}
