//https://coderanch.com/t/666742/java/understand-StringBuffer-thread-safe-StringBuilder
package ch9;
public class StringBufferBuilderPerformanceDemo {

	
	public void getStringBufferPerformance() {
		StringBuffer struf=new StringBuffer();
		long startTime=System.currentTimeMillis();
		for(int i=1;i<=100000;i++) {
			struf.append(i);
			struf.append(" ");
			struf.append(i);
			struf.append(" ");
		}
		System.out.println("Time Taken by StringBuffer is: " + (System.currentTimeMillis() - startTime) + " ms");
		
	}
	
	
    public void getStringBuilderPerformance() {
    	 
        StringBuilder strBuilderOne = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            strBuilderOne.append(i);
            strBuilderOne.append(" ");
            strBuilderOne.append(i);
            strBuilderOne.append(" ");
        }
 
        System.out.println("Time Taken by StringBuilder is: " + (System.currentTimeMillis() - startTime) + " ms");
 
    }
 
	public static void main(String[] args) {
		StringBufferBuilderPerformanceDemo s=new StringBufferBuilderPerformanceDemo();
		s.getStringBufferPerformance();
		s.getStringBuilderPerformance();
	}

}
