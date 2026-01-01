package java_8_core_concept;

public class Paytm implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {
        String txDate=UPIPayment.datePatterns("yyyy-MM-dd");
        return "";
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
