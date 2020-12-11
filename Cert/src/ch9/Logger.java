package ch9;

public class Logger {
 
	
	private StringBuilder sb=new StringBuilder();
	public void log(String message) {
		sb.append(System.currentTimeMillis());
		sb.append(": ");
		sb.append(Thread.currentThread().getName());
		sb.append(message);
		sb.append("\n");
	}
	
	public String getContents() {
	return sb.toString();
	}
	public static void main(String[] args) {

		Logger lo=new Logger();
		
		
	}

}

