package moviestore;

import java.util.Date;

public class MovieRequest {
    private Date requestDate;
    private Movie movie;

    public Date getRequestDate() { return requestDate; }
    public void setRequestDate(Date requestDate) { this.requestDate = requestDate; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }
}