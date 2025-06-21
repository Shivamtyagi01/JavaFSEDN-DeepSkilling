package Week1.DataStructuresAndAlgorithms.FinancialForcasting;
public class FinancialForecast {

    public static double forecastRecursive(double preVal, double rate, int years) {
        
        if (years == 0) {
            return preVal;
        }

        
        return forecastRecursive(preVal, rate, years - 1) * (1 + rate);
    }


    public static void main(String[] args) {
        //example for testing the recursive code
        double presentValue = 10000; 
        double growthRate = 0.10;    
        int years = 5;

        double futureRecursive = forecastRecursive(presentValue, growthRate, years);

        System.out.println("Future Value (Recursive): " + futureRecursive);
    }
}
