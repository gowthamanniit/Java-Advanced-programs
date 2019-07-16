import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task implements Runnable
{
	String taskname;
	public Task(String name)
	{
		taskname=name;
	}
	public void run()
	{
		System.out.println("The task name is  " +taskname + "executed by "+Thread.currentThread().getName());
	}
}
public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1=new Task("Task 1");
		Task task2=new Task("Task 2");
		Task task3=new Task("Task 3");
		ExecutorService thrExe=Executors.newCachedThreadPool();
		System.out.println("Executor Started");
		thrExe.execute(task1);
		thrExe.execute(task2);
		thrExe.execute(task3);
		thrExe.shutdown();
		
		if(thrExe.isShutdown()) {
			System.out.println("All tasks completed ,the executor is shutting down");
			
		}
	}

}s
       