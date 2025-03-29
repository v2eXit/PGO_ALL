package Tutorial4;

public class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats = 100;
    private int availableSeats = 0;
    private double price;


    public Event(String name, String date, String location, int maxNumberOfSeats, int availableSeats, double price) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.maxNumberOfSeats = maxNumberOfSeats;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public Event(String name, double price, String date, String location){
        setName(name);
        setPrice(price);
        setDate(date);
        setLocation(location);
    }

    public Event(String name, double price, String date){
        this(name, price,date,"");
    }

    public Event(String name, double price){
        this(name,price,"","");
    }


    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                ", maxNumberOfSeats=" + maxNumberOfSeats +
                ", availableSeats=" + availableSeats +
                ", price=" + price +
                '}';
    }


    public void reserveSeat(){
        if(availableSeats < maxNumberOfSeats){
            availableSeats--;
        }else {
            System.out.println("Sorry, there are no available seats for this event :(");
        }
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getPrice() {
        return price;
    }

}

