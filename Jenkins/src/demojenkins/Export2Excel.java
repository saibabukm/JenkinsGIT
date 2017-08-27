package demojenkins;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Export2Excel {

	public static void main(String[] args)throws BiffException, IOException {
		//excel path
		Workbook w=Workbook.getWorkbook(new File("d://eclipse//excel.xls") );
		//sheet1
		Sheet s=w.getSheet("Sheet1");
		//sheet2
		Sheet q=w.getSheet("Sheet2");
		//read values from shell
		String a=s.getCell(0,0).getContents();
		String b=s.getCell(1,0).getContents();
		String c=s.getCell(2,0).getContents();
		String d=q.getCell(0,0).getContents();
		//display output
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
					

	}

}
