class TourExpense {
    String type;
    double cost;
    String date;

    TourExpense(String type, double cost, String date) {
        this.type = type;
        this.cost = cost;
        this.date = date;
    }
}

public class ExpenseCalculator {
    public static void main(String[] args) {
        TourExpense[] expenses = {
                new TourExpense("Food", 50, "2024-10-01"),
                new TourExpense("Transport", 100, "2024-10-01"),
                new TourExpense("Lodging", 200, "2024-10-02")
        };

        double totalCost = 0;
        for (TourExpense expense : expenses) {
            totalCost += expense.cost;
            System.out.println(expense.date + " - " + expense.type + ": $" + expense.cost);
        }
        System.out.println("Total Tour Cost: $" + totalCost);
    }
}
