package Tutorial4;

import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> events;
    private ArrayList<Customer> customers;

    public ReservationSystem() {
        this.events = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void addEvent(String name, double price) {
        Event event = new Event(name, price);
        this.events.add(event);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addCustomer(String firstName, String lastName, String email) {
        Customer customer = new Customer(firstName, lastName, email);
        this.customers.add(customer);
    }

    public void makeReservation(Customer customer, Event event) {
        if (events.contains(event) && customers.contains(customer)) {
            customer.addReservation(event);
            event.reserveSeat();
        } else {
            System.out.println("Event or Customer not found");
        }
    }

    public Event findEvent(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public Customer findCustomer(String lastName) {
        for (Customer customer : customers) {
            if (customer.getLastName().equals(lastName)) {
                return customer;
            }
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
        } else {
            System.out.println("Event not found");
        }
    }

}