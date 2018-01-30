import java.util.ArrayList;


public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		//Writing the data
		x.add("Selenium");
		x.add("UFT");
		x.add(40000);
		x.add(3, "Manual");
		//length of the arraylist
		System.out.println(x.size());
		
		//Reading the data 
//		System.out.println(x.get(3));
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
		

	}

}
