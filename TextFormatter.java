public class TextFormatter {
    public static String formatText(String text) {
        return text.toUpperCase();
    }

    public static String formatText(String text, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(text);
            if (i != times - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static String formatText(String text, String prefix) {
        return prefix + " " + text;
    }

    public static void main(String[] args) {
        System.out.println(formatText("hello"));
        System.out.println(formatText("Echo", 3));
        System.out.println(formatText("System updated", "[INFO]"));
    }
}