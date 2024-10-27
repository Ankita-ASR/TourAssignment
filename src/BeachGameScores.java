public class BeachGameScores {
    public static void main(String[] args) {
        int[] teamAScores = {10, 15, 8};
        int[] teamBScores = {12, 14, 9};

        int totalA = 0, totalB = 0;
        for (int score : teamAScores) totalA += score;
        for (int score : teamBScores) totalB += score;

        System.out.println("Total Score for Team A: " + totalA);
        System.out.println("Total Score for Team B: " + totalB);
    }
}
