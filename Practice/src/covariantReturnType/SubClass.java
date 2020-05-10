package covariantReturnType;

public class SubClass extends SuperClass{
	
	public SubClass get()
	{
		System.out.println("Sub Class");
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		SuperClass test1= new SubClass();
		test1.get();

	}

}
