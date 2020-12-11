package ch9;

public class WaitTest {

	public static void main(String[] args) throws Exception{
		System.out.print("1 ");
		synchronized(args) {
			System.out.print("2 ");
		try {
			args.wait();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}System.out.println("3 ");
	}

}
