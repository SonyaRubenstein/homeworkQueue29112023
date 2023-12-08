import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> q = new LinkedList<>(firstClients);

        while (!q.isEmpty()) {
            String currentClient = q.poll(); //это мы сняли head
            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                q.offer("a friend of " + currentClient); // друг записался (закидывается в очередь)

            }
            System.out.println(currentClient + " сделал(а) новый маникюр");
        }
    }
}
