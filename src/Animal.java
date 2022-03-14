public class Animal {
    public static void main(String[] args) {
        String firstArgument = args[0];
        if (firstArgument.equalsIgnoreCase("animal"))
            System.out.println(getGreeting());
        else System.out.println("hello word");


    }

    public static String getGreeting() {
        return "animal !";
    }
}
