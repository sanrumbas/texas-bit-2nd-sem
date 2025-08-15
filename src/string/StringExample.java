package string;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = " World";
        // concat
        String result = str.concat(str2);
        System.out.println("Concat: " + result);
        // length
        System.out.println("Length: " + result.length());
        // charAt
        System.out.println("Char at 1: " + result.charAt(1));
        // substring
        System.out.println("Substring: " + result.substring(0, 5));
        // indexOf
        System.out.println("Index of 'o': " + result.indexOf('o'));
        // equals
        System.out.println("Equals 'Hello World': "
                + result.equals("Hello World"));
        // equalsIgnoreCase
        System.out.println("EqualsIgnoreCase: "
                + result.equalsIgnoreCase("hello world"));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // trim
        String spaced = "  padded  ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // replace
        System.out.println("Replace 'o' with '0': "
                + result.replace('o', '0'));

        // startsWith and endsWith
        System.out.println("Starts with 'He': " + result.startsWith("He"));
        System.out.println("Ends with 'ld': " + result.endsWith("ld"));

        // split
        String[] words = result.split(" ");
        System.out.println("Split result:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
