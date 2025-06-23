class StudentEnc{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class EncapsulationExample {
    public static void main(String[] args) {
        StudentEnc st = new StudentEnc();
        st.setName("Texas College");
        System.out.println(st.getName());
    }
}