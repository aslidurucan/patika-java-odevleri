package moviestore;

import java.util.ArrayList;
import java.util.List;

public class Subscriber extends User {
    private double credit;
    private Subscription subscription;
    private List<Rental> rentals = new ArrayList<>();

    public double getCredit() { return credit; }
    public void setCredit(double credit) { this.credit = credit; }

    public Subscription getSubscription() { return subscription; }
    public void setSubscription(Subscription subscription) { this.subscription = subscription; }

    public void rentMovie(Movie movie) {
        if (credit >= movie.getRentalPrice()) {
            credit -= movie.getRentalPrice();
            Rental rental = new Rental();
            rental.setMovie(movie);
            rentals.add(rental);
            System.out.println(movie.getTitle() + " kiralandı. Kalan kredi: " + credit);
        } else {
            System.out.println("Yetersiz kredi!");
        }
    }

    public List<Rental> getRentals() { return rentals; }
}