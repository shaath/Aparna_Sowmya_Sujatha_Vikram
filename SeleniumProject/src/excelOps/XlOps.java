package excelOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOps {

	public static void main(String[] args) throws IOException 
	{
		OrgHRMMaster om=new OrgHRMMaster();
		String xlpath="F:\\Aprna Recordings\\WorkSpace\\SeleniumProject\\src\\testdata\\EmpReg.xlsx";
		String xlout="F:\\Aprna Recordings\\WorkSpace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		
		om.Org_Launch(om.url);
		om.Org_Login("Admin", "admin");
		
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
					
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"-----"+l);
			
			String res=om.Org_Empreg(f, l);
			
			c2.setCellValue(res);
			
		}
		om.Org_Logout();
		om.Org_Close();
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
