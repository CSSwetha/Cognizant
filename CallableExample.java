import java.util.concurrent.*;  
import java.util.*;  
public class CallableExample {  
public static void main(String[] args) throws Exception {  
ExecutorService executor = Executors.newFixedThreadPool(3);  
List<Callable<String>> tasks = new ArrayList<>();  
for (int i = 1; i <= 5; i++) {  
int taskId = i;  
tasks.add(() -> "Task " + taskId + " executed by " + Thread.currentThread().getName());  
}  
List<Future<String>> results = new ArrayList<>();  
for (Callable<String> task : tasks) {  
results.add(executor.submit(task));  
}  
for (Future<String> result : results) {  
System.out.println(result.get());  
}  
executor.shutdown();  
}  
}
