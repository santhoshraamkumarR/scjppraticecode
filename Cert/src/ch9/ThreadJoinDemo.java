package ch9;
class MyJoinEx extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Sita Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){}
		}
	}
}



public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
        MyJoinEx ex = new MyJoinEx();
        ex.start();
		ex.join();	//--->1
		for(int i=0;i<5;i++)
		{
			System.out.println("Rama Thread");
		}
	
	}

}
