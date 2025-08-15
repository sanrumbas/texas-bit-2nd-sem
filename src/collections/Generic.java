package collections;
class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<String> stringbox = new Box<>();
        stringbox.setValue("Hello");
        System.out.println(stringbox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println(intBox.getValue());
    }
}