//Abstract cl;ass containing the method abstract method


abstract class Vehicle
{
abstract void bike();
}
class Honda extends Vehicle
{
void bike(){
System.out.println("    Bike is running  "   );
}
}
class AbstractExample1{
	public static void main(String args[]){
	Honda obj=new Honda();
	obj.bike();
	}
}


