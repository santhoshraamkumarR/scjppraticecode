package ch9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {
public static ExecutorService executor = null;
public static volatile Future taskOneResult = null;
public static volatile Future taskTwoResult = null;

	public static void main(String[] args) {
      executor = Executors.newFixedThreadPool(2);
      try {
    	  
      }catch(Exception e) {
    	  
      }
	}

}
