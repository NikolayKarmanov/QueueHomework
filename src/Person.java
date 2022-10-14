public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String getName() {
        return name + " " + surname;
    }

    public int getTickets() {
        return tickets;
    }

    public void spendTicket() {
        tickets -= 1;
    }
}
