
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
 

public class Watch123
{
/*	private static final Kind<?> ENTRY_CREATE = null;
	private static final Kind<?> ENTRY_MODIFY = null;
	private static final Kind<?> ENTRY_DELETE = null;
*/
	
	private Path path=null;
	WatchService watch1;
	public void initialization()
	{
		path=Paths.get("D:/NewJava"); //Paths to be monitored	
		try
		{
			watch1=FileSystems.getDefault().newWatchService();
			path.register(watch1, ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY);				
		}
		catch(IOException e)
		{
			System.out.println("IOException"+e.getMessage());
		}
}
private void monitorDirectory()
{
    	 WatchKey key= null;
  	 while(true)
   	 {
    	   	try
    	   	{
    	   		key=watch1.take();
    	   		for(WatchEvent<?> event:key.pollEvents())
    	   		{
    	   			Kind<?> k1=event.kind();
    	   		System.out.println("The event that occured on "
			+event.context().toString)+"is "+k1);
    	    		}
    	    	}
 	    	catch(InterruptedException e)
    	    	{
	 			System.out.println(e);
	    	}
  	    		boolean reset=key.reset();
    	    		if(!reset)
       			break;
  	}
      }
	    	    
	  
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Watch123 prg=new Watch123();
	prg.initialization();
	prg.monitorDirectory();
}

}
