public class ProblemTwo {
    public static void main(String[] args) {
        String[] words = {"abcw", "bar", "foo", "xtfn", "abcdef"};
        int n = words.length;
        int[] binary = new int[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                binary[i] |= (1 << index);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((binary[i] & binary[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        System.out.println(max);
    }
}
