package string;

public class StringExample {
    public static void main(String[] args) {
        String a= "Texas"; //immutable string
        a.concat(" Hello"); // a cannot be concat with String value
        System.out.println(a);//output ??? Texas
        System.out.println(a + " Hello"); //output???Texas Hello

        System.out.println("Hello TExas");
    }
}
