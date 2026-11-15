package model;

public class Customer extends User {
    
    private int points;
    private CustomerState state;

    public Customer(String username, String password, int points) {
        super(username, password);
        this.points = points;
        updateState();
    }

    public int getPoints() {
        return points;
    }

    public CustomerState getState() {
        return state;
    }

    public void setState(CustomerState state) {
        this.state = state;
    }

    public void addPoints(double amountSpent) {
        int earned = (int)(amountSpent * 10);
        points += earned;
        updateState();
    }

    public void updateState() {
        if (points >= 1000) {
            state = new GoldState();
        } else {
            state = new SilverState();
        }
    }

    public double buy(double totalCost) {
        addPoints(totalCost);
        return totalCost;
    }

    public double redeemPoints(double totalCost) {
        double discount = points / 100.0;
        double finalCost = totalCost - discount;

        if (finalCost < 0) {
            finalCost = 0;
        }

        int pointsUsed = (int)((totalCost - finalCost) * 100);
        points -= pointsUsed;

        addPoints(finalCost);
        updateState();
        return finalCost;
    }
}