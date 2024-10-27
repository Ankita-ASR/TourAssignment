class TourFeedback {
    String name;
    int rating;
    String comment;

    TourFeedback(String name, int rating, String comment) {
        this.name = name;
        this.rating = rating;
        this.comment = comment;
    }
}

public class FeedbackAnalyzer {
    public static void main(String[] args) {
        TourFeedback[] feedbacks = {
                new TourFeedback("Alice", 8, "Great tour!"),
                new TourFeedback("Bob", 9, "Very informative."),
                new TourFeedback("Cara", 7, "Could be better.")
        };

        int totalRating = 0;
        for (TourFeedback feedback : feedbacks) {
            totalRating += feedback.rating;
            System.out.println(feedback.name + " (" + feedback.rating + "): " + feedback.comment);
        }
        System.out.println("Average Rating: " + (double) totalRating / feedbacks.length);
    }
}
