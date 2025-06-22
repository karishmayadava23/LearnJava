package SingletonPattern;

public class TestBrowser {
	public static void main(String[] args) {

		// creating a task with the help of runnable interface
		Runnable task = () -> {
			Browser.getInstance().browserInfoMethod();
		};

		// created multiple threads and assigning the same task
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);

		t1.start();
		t2.start();
		t3.start();

		// wait for all threads to complete
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
