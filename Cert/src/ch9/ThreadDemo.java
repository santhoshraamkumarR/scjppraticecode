package ch9;

public class ThreadDemo {

	public static void main(String[] args)
	{
		MyThread t=new MyThread();//Instantiation of a Thread
		t.start();//starting of a Thread
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
	}

}
