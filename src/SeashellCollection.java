public class SeashellCollection {
    public static void main(String[] args) {
        String[] seashellTypes = {"a", "b", "c"};
        int[] seashellCounts = {0, 0, 0}; // Start with zero of each seashell type

        // Simulate collecting seashells
        seashellCounts[0] += 2;
        seashellCounts[1] += 3;
        seashellCounts[2] += 1;

        // Print the total number of each seashell collected
        for (int i = 0; i < seashellTypes.length; i++) {
            System.out.println(seashellTypes[i] + ": " + seashellCounts[i]);
        }
    }
}
