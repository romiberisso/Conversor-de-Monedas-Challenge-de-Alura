public class ConversionResponse {

    private String result;
    private double conversion_rate;
    private double conversion_result;

    public String getResult() {
        return result;
    }

    public double getConversionRate() {
        return conversion_rate;
    }

    public String getConversionResult() {
        return String.valueOf(conversion_result);
    }
}
