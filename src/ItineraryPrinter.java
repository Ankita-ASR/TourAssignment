class TourItinerary {
    String day;
    String time;
    String activity;

    TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }
}

public class ItineraryPrinter {
    public static void main(String[] args) {
        TourItinerary[] itinerary = {
                new TourItinerary("Day 1", "10:00 AM", "Beach Visit"),
                new TourItinerary("Day 1", "2:00 PM", "City Tour"),
                new TourItinerary("Day 2", "11:00 AM", "Museum Visit"),
        };

        for (TourItinerary item : itinerary) {
            System.out.println(item.day + " - " + item.time + ": " + item.activity);
        }
    }
}
