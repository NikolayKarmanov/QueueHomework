import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            System.out.print(queue.peek().getName() + " прокатился на аттракционе. ");
            queue.peek().spendTicket();
            System.out.println("(Осталось " + queue.peek().getTickets() + " билетов.)");
            Person temp = queue.poll();
            if (temp.getTickets() != 0) {
                queue.add(temp);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Nikolay", "Karmanov", 6));
        people.add(new Person("Olga", "Melnikova", 4));
        people.add(new Person("Vadim", "Vladimirov", 5));
        people.add(new Person("Radik", "Vagapov", 3));
        people.add(new Person("Svetlana", "Kozlova", 1));
        return people;
    }
}
