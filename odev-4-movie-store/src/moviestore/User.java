package moviestore;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private List<Purchase> purchases = new ArrayList<>();
    private List<MovieRequest> movieRequests = new ArrayList<>();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addPurchase(Purchase purchase) { purchases.add(purchase); }
    public void addMovieRequest(MovieRequest request) { movieRequests.add(request); }

    public List<Purchase> getPurchases() { return purchases; }
    public List<MovieRequest> getMovieRequests() { return movieRequests; }
}