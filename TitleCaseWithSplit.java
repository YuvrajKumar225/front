public class TitleCaseWithSplit {
    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                String word = words[i];
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalizedWord);
                
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "java is fun";
        String output = toTitleCase(input);
        System.out.println("Input: '" + input + "'");
        System.out.println("Output: '" + output + "'");
    }
}
