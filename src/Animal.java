public class Animal {
    public static void main(String[] args) {
        String firstArgument = args[0];
        if (firstArgument.equalsIgnoreCase("cat"))
            System.out.println(getCatGreeting());
        else System.out.println("hello word");


    }

    public static String getCatGreeting() {
        return "Meow !";
    }
}
