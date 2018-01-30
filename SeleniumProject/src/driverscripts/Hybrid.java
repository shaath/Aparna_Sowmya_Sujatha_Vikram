package driverscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid 
{
	public static void main(String[] args) throws IOException
	{
		DateFormat formate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		String d=formate.format(date);
		System.out.println(d);
		String x=d.replace("/", "");
		String y=x.replace(" ", "");
		String z=y.replace(":", "");
		System.out.println(z);
		OrgHRMMaster om=new OrgHRMMaster();
		String res=null;
		String xlpath="F:\\Aprna Recordings\\WorkSpace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Aprna Recordings\\WorkSpace\\SeleniumProject\\src\\results\\Hybridres"+z+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");//----> Testcase
		XSSFSheet ws1=wb.getSheet("Teststeps");//---> Teststeps
		XSSFSheet ws2=wb.getSheet("Testdata");//---> Testdata
		XSSFSheet ws3=wb.getSheet("Empreg");//---> Empreg
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int empRc=ws3.getLastRowNum();
		
		//TestCase
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				//TestSteps 
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						
						switch (key)
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=om.Org_Launch(url);
							break;
							
						case "login":	
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.Org_Login(u, p);
							break;
							
						case "logout":
							res=om.Org_Logout();
							om.Org_Close();
							break;
						
						case "Empreg":
							for (int k = 1; k <= empRc; k++) 
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								res=om.Org_Empreg(f, l);
								ws3.getRow(k).createCell(2).setCellValue(res);
							}			
							break;
						
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.Org_Userreg(ename, uname, pswd, cpswd);
							break;
							
						case "Ulogin":
							String un=ws2.getRow(1).getCell(6).getStringCellValue();
							String cp=ws2.getRow(1).getCell(7).getStringCellValue();
							res=om.Org_Login(un, cp);
							break;
							
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						//Result updation in teststeps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						//Result updation in testcase sheet
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}
}
