class Count2{
private int serialNumber;
private static int Counter =0;
public static int getTotalCount(){
return Counter;
}
public Count2(){
Counter++;
serialNumber=Counter;
}
}
class TestCounter{
public static void main(String args[]){
System.out.println("number of counter is"  +Count2.getTotalCount());
Count2 counter=new Count2();
System.out.println("Number of counter is"  +Count2.getTotalCount());
}
}
