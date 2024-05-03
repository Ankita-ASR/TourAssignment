import java.util.Arrays;
public class BeachCleanup {
        public static void main(String[] args) {
            int[] beachSections = {1, 1, 1, 1, 1}; // 1= dirty sections
            // Clean =(set all to 0)
            for (int i = 0; i < beachSections.length; i++) {
                beachSections[i] = 0;
            }
            System.out.println("Beach after cleanup: " + Arrays.toString(beachSections));
        }
    }
