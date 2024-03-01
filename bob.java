import java.util.Arrays;

public class StatisticsCalculator {

    public static void main(String[] args) {
        double[] data = {4, 7, 10, 13, 16}; // Sample data
        
        // Calculate and print standard deviation
        double stdDeviation = calculateStandardDeviation(data);
        System.out.println("Standard Deviation: " + stdDeviation);
        
        // Calculate and print range
        double range = calculateRange(data);
        System.out.println("Range: " + range);
    }
    
    // Method to calculate standard deviation
    public static double calculateStandardDeviation(double[] data) {
        double mean = calculateMean(data);
        double sum = 0;
        for (double num : data) {
            sum += Math.pow(num - mean, 2);
        }
        double variance = sum / data.length;
        return Math.sqrt(variance);
    }
    
    // Method to calculate mean
    public static double calculateMean(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }
    
    // Method to calculate range
    public static double calculateRange(double[] data) {
        double min = data[0];
        double max = data[0];
        for (double num : data) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }
}
