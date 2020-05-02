import java.util.ArrayList;

//done

public class ProductReview
{
    private String name;
    private String review;

    /** Constructs a ProductReview object and initializes the instance variables. */
    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    /** Returns the name of the product. */
    public String getName() {
        return name;
    }

    /** Returns the review of the product. */
    public String getReview() {
        return review;
    }
}

class ReviewCollector
{
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        /* to be implemented in part (a) */


        reviewList.add(prodReview);
        int track = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(prodReview.getName())) {
                return;
            }
        }
        productList.add(prodReview.getName());


    }


    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        /* to be implemented in part (b) */

        int goodReviews = 0;
        String searchString = "best";

        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).getName().equals(prodName)) {
                if (reviewList.get(i).getReview().indexOf(searchString) != -1) {
                    goodReviews++;
                }
            }
        }
        return goodReviews;
    }

    /** Below methods not included in original problem. Needed for testing */
    public ArrayList<String> getProductList() {

        return productList;
    }

    public ArrayList<ProductReview> getReviewList() {

        return reviewList;
    }

    // There may be instance variables, constructors, and methods not shown.
}
