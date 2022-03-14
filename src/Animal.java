public class Animal {
    public static void main(String[] args) {
        String firstArgument = args[0];
        if (firstArgument.equalsIgnoreCase("bird"))
            System.out.println(getBirdGreeting());
        else System.out.println("hello word");


    }

    public static String getBirdGreeting() {
        return "Tweet !";
    }
}
