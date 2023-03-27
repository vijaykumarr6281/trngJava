//Absrtract method contain abstract and non abstract method

abstract class Vehicle
{
abstract void bike();//abstract method 
void car()//non abstract method
	{  System.out.println("   Car running   ");}
}
class Honda extends Vehicle
{
void bike(){System.out.println("    Bike is running  "   );}
}
class AbstractExample3{
	public static void main(String args[]){
	Honda obj=new Honda();
	obj.bike();
	obj.car();
	Vehicle v=new Vehicle();//abstract class can'tne instantiated
}
}

