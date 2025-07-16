package string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // append
        sb.append(" World");
        System.out.println("Append: " + sb);
        // insert
        sb.insert(5, ",");
        System.out.println("Insert: " + sb);
        // replace
        sb.replace(6, 11, " Java");
        System.out.println("Replace: " + sb);
        // delete
        sb.delete(6, 11);
        System.out.println("Delete: " + sb);
        // reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);
        sb.reverse(); // back to normal
        // capacity
        System.out.println("Capacity: " + sb.capacity());
        // ensureCapacity
        sb.ensureCapacity(40);
        System.out.println("Ensured Capacity: " + sb.capacity());
        // length
        System.out.println("Length: " + sb.length());
        // charAt and setCharAt
        System.out.println("CharAt 0: " + sb.charAt(0));
        sb.setCharAt(0, 'h');
        System.out.println("SetCharAt: " + sb);
        // substring
        System.out.println("Substring: " + sb.substring(0, 5));
    }
}
