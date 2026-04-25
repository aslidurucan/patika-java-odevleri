package moviestore;

public class Main {
    public static void main(String[] args) {

        // Film oluştur
        Movie movie1 = new Movie();
        movie1.setId("M1");
        movie1.setTitle("Inception");
        movie1.setPrice(50.0);
        movie1.setRentalPrice(10.0);
        movie1.setAvailable(true);

        Movie movie2 = new Movie();
        movie2.setId("M2");
        movie2.setTitle("Interstellar");
        movie2.setPrice(60.0);
        movie2.setRentalPrice(15.0);
        movie2.setAvailable(false);

        // Normal kullanıcı oluştur
        User user = new User();
        user.setId("U1");
        user.setName("Ali");

        // Normal kullanıcı film satın alır
        Purchase purchase = new Purchase();
        purchase.setMovie(movie1);
        user.addPurchase(purchase);
        System.out.println(user.getName() + " -> " + movie1.getTitle() + " satın aldı.");

        // Normal kullanıcı mevcut olmayan filmi talep eder
        MovieRequest request = new MovieRequest();
        request.setMovie(movie2);
        user.addMovieRequest(request);
        System.out.println(user.getName() + " -> " + movie2.getTitle() + " talep etti.");

        // Abone kullanıcı oluştur
        Subscriber subscriber = new Subscriber();
        subscriber.setId("S1");
        subscriber.setName("Ayşe");
        subscriber.setCredit(100.0);

        Subscription subscription = new Subscription();
        subscriber.setSubscription(subscription);

        // Abone film kiralar
        subscriber.rentMovie(movie1);

        // Abone film satın alır
        Purchase purchase2 = new Purchase();
        purchase2.setMovie(movie1);
        subscriber.addPurchase(purchase2);
        System.out.println(subscriber.getName() + " -> " + movie1.getTitle() + " satın aldı.");
    }
}