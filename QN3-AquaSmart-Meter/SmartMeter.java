public class SmartMeter {
    private static final double RATE_PER_LITRE = 50.0;

    private String meterId;
    private double creditBalance;
    private boolean valveOpen;

    public SmartMeter(String meterId, double creditBalance) {
        this.meterId = meterId;
        this.creditBalance = creditBalance;
        this.valveOpen = true;
    }

    public double loadToken(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Token amount must be positive");
        }
        creditBalance += amount;
        if (!valveOpen) {
            valveOpen = true;
        }
        return creditBalance;
    }

    public boolean recordConsumption(double litres) {
        if (litres <= 0) {
            throw new IllegalArgumentException("Litres must be positive");
        }
        if (!valveOpen) {
            return false;
        }
        double cost = litres * RATE_PER_LITRE;
        if (creditBalance - cost <= 0) {
            creditBalance = 0;
            valveOpen = false;
            return true;
        }
        creditBalance -= cost;
        return true;
    }

    public String getMeterId() { return meterId; }
    public double getCreditBalance() { return creditBalance; }
    public boolean isValveOpen() { return valveOpen; }
}
