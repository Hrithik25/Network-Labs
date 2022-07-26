
public class MyThread1 extends Thread {
	
	public void run() {
		for(int i=0; i<5000; i++) {
			System.out.println("Hello this is my thread");
			if(i%200 == 0) {
				try {
					
				}
			}
		}
			
	}
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		myThread.start();
		for(int i=0; i<10000; i++) {
			System.out.println("Main thread");
			if(i%)
		}
			
	}

}

