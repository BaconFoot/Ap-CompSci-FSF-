package pkg;

public class Movie{
    //Part 1
    double rating;
    int revenue;
    String movie;
    int numRatings;
    
    public Movie(){
        movie = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String m, double a, int n, int r){
        movie = m;
        rating = a;
        numRatings = n;
        revenue = r;
    }
// Part 2
    public void movieToString(){
        System.out.println("Movie: " + movie);
        System.out.println("Rating: " + rating);
        System.out.println("Numer of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue + "\n ");
    }
// Part 3
    public String getMovieName(){
        return movie;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
// Part 4
    public double addRating(double d){
        rating = (rating * numRatings + d) / (numRatings + 1); 
        
        numRatings++;
        return rating;
        
    }
    
// Part 5
    public boolean compareRatings(Movie mB){
        if(mB.getRating() > rating){
            return false;
        }
        else{
            return true;
        }
    }
//Part 6
    public String revenueToString(){
        int revA = revenue / 1000000;
        int tempRev = revenue - (revA * 1000000);
        
        int revB = revenue / 1000;
        int tempRevB = revenue - (revB * 1000);
        
        int revC = revenue / 1;
        int tempRevC = revenue - revC;
        
        
        return tempRev + "," + tempRevB + "," + tempRevC;
    }
    

    
    
}
