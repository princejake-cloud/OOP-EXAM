public class SmartMeterDemo {
    public static void main(String[] args) {
        SmartMeter meter = new SmartMeter("MTR001", 40);
        System.out.println("Initial credit: " + meter.getCreditBalance());

        boolean dispensed = meter.recordConsumption(1);
        System.out.println("Consumed 1L, dispensed=" + dispensed +
            ", credit=" + meter.getCreditBalance() + ", valveOpen=" + meter.isValveOpen());

        meter.loadToken(500);
        System.out.println("After loading token, credit=" + meter.getCreditBalance() +
            ", valveOpen=" + meter.isValveOpen());
    }
}
