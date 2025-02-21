import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }
        
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
