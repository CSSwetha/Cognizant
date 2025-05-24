import java.time.Duration;
import java.time.Instant;
public class VirtualThreadDemo {
public static void main(String[] args) {
Instant start = Instant.now();
for (int i = 0; i < 100000; i++) {
Thread.startVirtualThread(() -> {
System.out.println("Hello from virtual thread " + Thread.currentThread());
});
}
Instant end = Instant.now();
System.out.println("Duration: " + Duration.between(start, end).toMillis() + " ms");
}
}
