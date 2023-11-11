package com.date;

 

	//content obj class

	public class Date {

	  //data abstraction and encapsulation
		
		protected static int dd;
		protected static int mm;
		protected static int yy;
		
		//Initialize data using const
		
		public Date(int dd,int mm,int yy)
		{
			Date.dd=dd;
			Date.mm=mm;
			Date.yy=yy;		
		}
		
		//setters for updation
		
		public void setDd(int dd)
		{
			Date.dd=dd;
		}
		public void setMm(int mm)
		{
			Date.mm=mm;
		}
		public void setYy(int yy)
		{
			Date.yy=yy;
		}
		
		//getters to access data
		
		public static int getDd()
		{
			return dd;
		}
		public static int getMm()
		{
			return mm;
		}
		public static int getYy()
		{
			return yy;
		}
		
		//a method to print contents of the object
		
		public String toString()
		{
			
			return "Date :"+dd +"/"+mm+"/"+yy;
		}
		
		
		
	}



