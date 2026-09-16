class Department{
void run(){
System.out.println("Department of Computer Application");
}
}
class BCA extends Department{
@Override
void run(){
System.out.println("BCA is running smoothly");
}
}
public class MethodOverridingDemos{
public static void main(String[]args){
Department D=new Department();
D.run();
BCA B=new BCA();
B.run();
Department obj=new BCA();
obj.run();
}
}
