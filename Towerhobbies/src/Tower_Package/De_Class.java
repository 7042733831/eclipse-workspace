package Tower_Package;

import net.bytebuddy.implementation.bind.annotation.Super;

class De_Class 
{
	
	private static final int red = 0;
	int color= red; 
	 void test()
	 {
		 System.out.println("Inheritance test ");
	 }
	 void check()
	 {
		 System.out.println("Polymorphism Check "); 
	 }
	 
	 class uk extends De_Class
	 {
		 void test()
		 {
			 System.out.println(color);
		 }
	 }

public static void main(String arg[])
{
	De_Class obj1 = new De_Class();
	 obj1.test();
	
	 De_Class ob2 = new De_Class();
	 ob2.test();
	 ob2.check();
	
}
}