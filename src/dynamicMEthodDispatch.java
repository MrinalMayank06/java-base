class phone{
    public void greet()
    {
        System.out.println("good morning");
    } public void name()
    {
        System.out.println("my name is one");
    }}

class two extends phone{
    public void Sawagat(){
        System.out.println("aaapka swagat hai ");
    }
    public void name()
    {
        System.out.println("my name is two");
    }
}
public class dynamicMEthodDispatch {
    public static void main(String[] args) {
phone  obj = new phone();
obj.name();

two smart_phone = new two();
smart_phone.name();

phone tr= new two();
obj.name();
obj.greet();
    }
}
