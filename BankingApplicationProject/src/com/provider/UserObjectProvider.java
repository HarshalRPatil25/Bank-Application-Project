package com.provider;

 

import java.io.FileInputStream;
import java.util.Properties;
 
import com.services.UserServices;

public class UserObjectProvider
{
	@SuppressWarnings("deprecation")
	public static UserServices createObject()
	{
		UserServices u=null;
		try
		{
			FileInputStream fis=new FileInputStream(".//resources//Info.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String className=p.getProperty("UserClass");
			u=(UserServices)Class.forName(className).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
         return u;

	}
}
