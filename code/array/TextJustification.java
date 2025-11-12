import java.util.*;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;

        while (i < n) {
            int j = i, lineLength = 0;

            // 1️⃣ Determine how many words fit into the current line
            while (j < n && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int numWords = j - i;
            int numSpaces = maxWidth - lineLength;
            StringBuilder line = new StringBuilder();

            // 2️⃣ Handle last line or single-word line (left-justified)
            if (j == n || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                // pad remaining spaces
                while (line.length() < maxWidth) line.append(" ");
            } else {
                // 3️⃣ Fully justify (evenly distribute spaces)
                int spaceBetween = numSpaces / (numWords - 1);
                int extraSpaces = numSpaces % (numWords - 1);

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spacesToAdd = spaceBetween + (extraSpaces-- > 0 ? 1 : 0);
                        for (int s = 0; s < spacesToAdd; s++) line.append(" ");
                    }
                }
            }

            result.add(line.toString());
            i = j; // move to next line
        }

        return result;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> res = sol.fullJustify(words, maxWidth);

        for (String line : res) {
            System.out.println("\"" + line + "\"");
        }
    }
}
