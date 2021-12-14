//Generic concept
class Generics1<T>{
    private T val1;

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }
}
public class Practice{
    public static void main(String[] args) {
        Generics1<String>obj=new Generics1<>();
        obj.setVal1("Anshika");
        System.out.println(obj.getVal1());
    }
}







