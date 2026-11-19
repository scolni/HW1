public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg : args) {
            char firstCharacter = arg.charAt(0);
            if (firstCharacter % 5 == 0) {
                System.out.println(firstCharacter);
            }
        }
    }
}
