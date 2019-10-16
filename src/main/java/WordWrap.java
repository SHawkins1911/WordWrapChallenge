public class WordWrap {

    private static final String NEXTLINE = "\n";


    public static String wrappedText(String [] words, int lineWidth) {

        int widthCheck;
        int extraSpaces = 0;
        int lineCount = 1;
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            widthCheck = (lineCount * lineWidth) - sb.length() - word.length() - 1;

            if (widthCheck >= 0) {
                extraSpaces = widthCheck;
                sb.append(word).append(" ");
            } else {
                WordWrap.addSpaces(sb, extraSpaces);
                sb.append(NEXTLINE).append(word).append(" ");
                lineCount++;
            }
        }
        return sb.toString();
    }

    //Method to add the appropriate amount of spaces at the end of lines
    public static StringBuilder addSpaces(StringBuilder sb, int extraSpaces){
        for (int i = 1; i <= extraSpaces ; i++) {
            sb.append(" ");
        }
        return sb;
    }
}
