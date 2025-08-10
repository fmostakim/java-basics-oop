public class Problem7 {
    public static void main(String[] args){
        double distanceInKm = 14.0;
        double minutes = 45.0;
        double seconds = 30.0;
        double miles = distanceInKm/ 1.6;

        double hours = (minutes/60.0) + (seconds/3600.0);

        double AvgSpeed = miles/hours;

        System.out.println("The average is speed is "+AvgSpeed+" miles per hour");
    }
}
