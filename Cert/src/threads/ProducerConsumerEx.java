package threads;
/**
 *  
 * 
 * @author santhosh
 * 
 * Producer - Consumer Problem:
 *              Producer thread is responsible to produce items to the queue, and 
 *              Consumer thread is responsible to consume items from the queue. 
 *              
 *              If queue is empty the consumer thread will call wait() method 
 *              entered into the waiting state.
 *              
 *              After producing items to the queue,the producer thread is responsible to 
 *              call notify method,then waiting consumer will get that notification and 
 *              continue its execution with updated items.
 *              
 *
 */

class ProduceThread{
	
	 public void  produce(){
		synchronized(this) {
			this.notify();
		}
	}
	
}

class ConsumerThread{
	 public void  consume() throws InterruptedException{
		synchronized (this) {
			this.wait();
			
		}
	}
}
public class ProducerConsumerEx {

}
