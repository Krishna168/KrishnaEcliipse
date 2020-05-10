package covariantReturnType;

public class SuperClass {

	public SuperClass get()
	{
		System.out.println("Super Class");
		return new SuperClass();
	}

}
