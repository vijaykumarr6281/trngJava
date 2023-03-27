class MyDate{
private int day;
private int month;
private int year;
public MyDate(int day, int month , int year){
	this.day=day;
	this.month=month;
	this.year=year;
	}
public boolean equals(Object O){
boolean result=false;
	if ((O!=null)&&(O instanceof MyDate)){
		MyDate d=(MyDate) O;
		if ((day==d.day)&&(month==d.month)&&                                        (year==d.year)){
		result=true;
		}
	}
return result;
}
public int hashCode(){
     return (day ^ month ^ year);
     }
}
class TestEquals{
public static void main(String args[]){
MyDate date1=new MyDate(23,  2,  2003);
MyDate date2=new MyDate(23,  2,  2003);
if (date1==date2)
	{
	System.out.println("date1 is identical to date2");
	}
else	
	{
	System.out.println("date1 is not identical  to date2");
	}
if  (date1.equals(date2))
	{
	System.out.println("date1 is equals to date2");
	}
else
	{
	System.out.println("date1 is not equals to date2");
	}
                 System.out.println("set date2=date1;");
date2=date1;
if (date1==date2)
	{
	System.out.println("date1 is identical to date2");
	}
else	
	{
	System.out.println("date1is nit identical to date2");
	}
}
}
















