import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Concurrency {
	public static void main(String[] args) {
		
		//Main executor
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//Basic multi-threading
		executor.execute(new Runnable() {
			public void run() {
				System.out.println("Running!");
			}
		});
		
		
		//Future implementation
		try {
			Future<String> future = executor.submit(new Callable<String>() {
				public String call() throws Exception {
					return "The Future!";
				}
				
			});
			System.out.println(future.get());
		} catch(Exception e) {
			System.out.println("The future is bleak!");
		};
		
	}
}

//http://tutorials.jenkov.com/java-util-concurrent/executorservice.html


