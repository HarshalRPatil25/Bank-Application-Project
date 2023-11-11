package com.provider;
import java.io.FileInputStream;

import java.util.Properties;

import com.services.AccountServices;
 

public class BusinessObjectProvider 
{
	 
	 
 //create an object of BusinessLogic class
	 
		@SuppressWarnings("deprecation")
		public static AccountServices createObject()
		{
			AccountServices acc=null;
			try
			{
				FileInputStream fis=new FileInputStream(".//resources//Info.properties");
				Properties p=new Properties();
				p.load(fis);
				
				String className=p.getProperty("BusinessClass");
				acc=(AccountServices)Class.forName(className).newInstance();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
             return acc;

		}
}



		
		

	


