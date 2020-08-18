import java.util.ArrayList;

public class PrintOnlyUniqueNumber {

	public static void main(String[] args) {
       int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!ab.contains(a[i]))
			{	 
				ab.add(a[i]);
			  System.out.print(a[i]); 
			  System.out.print("\t");
			  }
		}

	}

}
