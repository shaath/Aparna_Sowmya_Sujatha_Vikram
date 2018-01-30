package methods;

public class TestSuit {

	public static void main(String[] args) 
	{
		
		OrgHRMMaster om=new OrgHRMMaster();
		//Login
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
		
		//Empreg
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Empreg("Sandeep", "Kumar");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
		//Userreg
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Userreg("Sandeep Kumar", "SandeepKumar123", "SandeepKumar123", "SandeepKumar123");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");

		//UserLogin
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("SandeepKumar123", "SandeepKumar123");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
	}

}
