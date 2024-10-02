class A
{
	public void f1(int x,int y,int z){
		System.out.println("class A");
	}
}
class B extends A
{
	public void f1(int x){
		System.out.println("functin 1 in class B");
	}
	public void f1(int x,int y){
		System.out.println("functin 2 in class B");
	}
}
public class Overloading{
	public static void main(String []args){
		B obj=new B();
		obj.f1(5);
		obj.f1(3,4);
		A a1=new A();
		a1.f1(7,3,1);
	}		
}	