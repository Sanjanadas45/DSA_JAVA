package ASSIGNMENTS.Searching.Medium;

public class Reach_Number {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(reachNumber(num));
    }
    public static int reachNumber(int target) {
        // Initialize 'i' which represents the current step number (1-indexed)
        int i = 0;
        // Initialize 'currPos' which keeps track of the current position reached
        int currPos = 0;

        // The problem is symmetric; reaching 'target' is the same as reaching '-target'.
        // So, we take the absolute value of the target to simplify calculations.
        if (target < 0){
            target = -1 * target;
        }
        // If the target is 0, we are already at the target, so 0 steps are needed.
        if (target == 0){
            return 0;
        }
        // This loop simulates taking steps until the target is reached or surpassed
        // and the parity condition for reaching the target is met.
        while (true){
            // Check if we have reached or surpassed the target AND
            // if the difference between current position and target is an even number.
            // The even difference ensures that we can flip the sign of some steps
            // to precisely land on the target. If the difference is 'x', we can change
            // one step 'k' to '-k' if 'k' is 'x/2'. This changes the total sum by '-2k',
            // effectively allowing us to "dial back" to the target.
            if ((currPos >= target) && ((currPos - target) % 2 == 0)){
                // If both conditions are met, 'i' is the minimum number of steps.
                return i;
            }
            // Increment the step number.
            i++;
            // Add the current step number to the current position.
            // This represents moving 'i' steps in the current direction.
            currPos += i;
        }
    }
}
