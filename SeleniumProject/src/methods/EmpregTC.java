package methods;

public class EmpregTC {

	public static void main(String[] args) 
	{
		OrgHRMMaster om=new OrgHRMMaster();
		
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");

	}

}
