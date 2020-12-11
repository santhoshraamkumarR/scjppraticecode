package threads_advanced_concepts;

public class FindAllThreadGroup {
 public static void main(String[] args) {
	ThreadGroup t = Thread.currentThread().getThreadGroup().getParent();
	Thread[] t1 = new Thread[t.activeCount()];
	t.enumerate(t1);
	for(Thread th:t1) {
		System.out.println(th.getName()+": "+th.isDaemon());
	}
}
}
