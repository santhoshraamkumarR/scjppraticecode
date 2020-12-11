package durgasoft_oops;
/*
 * Video 17
 *           Singleton class:
 *                  For any java class,if we allowed to create only one object,such type of class is called
 *                  singleton class.
 *                   Ex: Runtime,Business Delegate,ServiceLocator....
 *                   
 *           Advantage of singleton class:
 *                        If several people have same requirement,then it is not recommended to create a separate
 *          object for every requirement.
 *                         We have to create only one object and we reuse every similar requirement,so that
 *           performance and memory utilization will be improved.
 *           This is the core idea of singleton class.
 *           
 *           
 *           	Runtime r1=Runtime.getRuntime();
          		//getRuntime() method is a factory method
				Runtime r2=Runtime.getRuntime();
				Runtime r3=Runtime.getRuntime();
				.................................................
				.................................................

				System.out.println(r1==r2);//true
				System.out.println(r1==r3);//true
 *           
 * 		
 *
 * How to create our own singleton classes?
 *    We can create our own singleton classes,for these we have to use private constructor and private
 *    static variable and public factory method.
 *    	
 * 
 *    Note 1:
 *             Runtime class is internally implemented by using this approach.
 *             
 *             
 *    Class is not final,but we are not allowed to create child classes. How it is possible?
 *             We can't create child class for this class. By declaring every constructor has private.
 *               Ex:
 *                    class Parent {
						  private Parent() { 
						  }
						  
		      We cant create a child class for the above class.			  
						  
 */
//Approach	1:
class Test{

	private static Test t = new Test();

	private Test() {}

	public static Test getTest()
	//getTest() method is a factory method
	{
		 
		return t;
	}

}


//Approach 2:
/*
 * At any point of time for the below class,we can create only one object,hence Test1 class is
 * Singleton class. 
 * 
 */
class Test1{
	private static Test1 t=null;
	private Test1()
	{}
	public static Test1 getTest()
	//getTest() method is a factory method
	{
		if(t==null)
		{
			t=new Test1();
		}
		return t;
	}
}
	

public class Ex25 {

}
