package ASSIGNMENTS.Arrays.Easy;

public class Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
//    Algorithm:-
//    1. Initialize the variable currentAltitude to 0; this is the current altitude of the biker.
//    2. Initialize the variable highestPoint to currentAltitude, as the highest altitude we have seen is 0.
//    3. Iterate over the gain in altitude in the list gain and add the current gain altitudeGain to the variable currentAltitude.
//    4. Update the variable highestPoint as necessary.
//    5. Return highestPoint.
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestPoint = currentAltitude;
        for (int altitudeGain : gain) {
            currentAltitude += altitudeGain;
            highestPoint = Math.max(highestPoint, currentAltitude);
        }
        return highestPoint;
    }
}
