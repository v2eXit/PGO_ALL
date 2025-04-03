package Tutorial4;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList;

    public Customer(String firstName, String lastName, String email, ArrayList<Event> reservationList) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setReservationList(reservationList);
    }

    public Customer(String firstName, String lastName, String email) {
        this(firstName, lastName, email, new ArrayList<>());
    }

    public void addReservation(Event event) {
        reservationList.add(event);
    }

    public void displayReservations() {
        if (reservationList.isEmpty()) {
            System.out.println("No reservations for this event");
        } else {
            for (Event event : reservationList) {
                System.out.println(event);
            }
        }
    }

    public void cancelReservation(Event event) {
        reservationList.remove(event);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", reservationList=" + reservationList +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Event> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Event> reservationList) {
        this.reservationList = reservationList;
    }

}