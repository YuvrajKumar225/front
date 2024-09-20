public class MinDistanceBetweenWords {

    public static int minDistanceBetweenWords(String[] words, String word1, String word2) {
        int n = words.length;
        int index1 = -1;
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
                if (index2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            }
            if (words[i].equals(word2)) {
                index2 = i;
                if (index1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }

    public static void main(String[] args) {
        String[] arr = {"the", "quick", "brown", "fox", "quick", "the"};
        String word1 = "the";
        String word2 = "fox";
        int ans = minDistanceBetweenWords(arr, word1, word2);
        System.out.println(ans);
    }
}
