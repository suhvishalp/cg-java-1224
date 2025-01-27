
public class BatonPassing {

    public static void findBatonPasserReceiver(int n, int t) {
        int cycleDuration = 2 * (n - 1);
        int effectiveTime = t % cycleDuration;

        int passer, receiver;

        if (effectiveTime <= n - 1) {
            // Forward direction
            passer = effectiveTime + 1;
            receiver = passer + 1;
        } else {
            // Backward direction
            passer = 2 * n - 1 - effectiveTime;
            receiver = passer - 1;
        }

        System.out.println("At time " + t + " seconds:");
        System.out.println("Friend " + passer + " is passing the baton to Friend " + receiver + ".");
    }

    public static void main(String[] args) {
        int n = 5; // Number of friends
        int t = 7; // Time in seconds

        findBatonPasserReceiver(n, t);
    }
}

