package methods;

public class UserLoginTC {

	public static void main(String[] args) 
	{
		OrgHRMMaster om=new OrgHRMMaster();
		
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);

		res=om.Org_Login("SharathChandra", "SharathChandra");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");

	}

}
