public class print {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "in", "a", "frame"};
        printInFrame(words);
    }
    public static void printInFrame(String[] words) {
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        String border = "*".repeat(maxLength + 4);
        System.out.println(border);
        for (String word : words) {
            System.out.printf("* %-"+maxLength+"s *\n", word);
        }
        System.out.println(border);
    }
}