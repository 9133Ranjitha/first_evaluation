public class main{
    public static void main(String[] args) {
        String input = "ranju";
        String reeString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reeString += input.charAt(i);
        }

        System.out.println("Input string: " + input);
        System.out.println("Ree string: " + reeString);
    }
}
