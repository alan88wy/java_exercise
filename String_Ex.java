public class String_Ex {
    
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println("The string is -> " + s);
        System.out.println("The length of the string is -> " + s.length());
        System.out.println("The first character of the string is -> " + s.charAt(0));
        System.out.println("The last character of the string is -> " + s.charAt(s.length() - 1));
        System.out.println("The substring of the string is -> " + s.substring(0, 5));
        System.out.println("The index of the string is -> " + s.indexOf("World"));
        System.out.println("The index of the string is -> " + s.indexOf("World", 7));
        System.out.println("Uppercase -> " + s.toUpperCase());
        System.out.println("Lowercase -> " + s.toLowerCase());

        int i = s.compareTo("Hello World!");
        System.out.println("Compare to Hello World! -> " + i);

        boolean b = s.equals("hello world");
        System.out.println("Equals hello world -> " + b);

        b = s.equalsIgnoreCase("hello world");
        System.out.println("Equals hello world -> " + b);

        b = s.startsWith("Hello");
        System.out.println("Starts with Hello -> " + b);

        b = s.endsWith("World!");
        System.out.println("Ends with World! -> " + b);

    }  
}
