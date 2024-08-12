class Employee{
    int id;
    int salary= 556;
    String  name;
}



public class km_object_oriented_programming {
    public static void main(String[] args) {
        System.out.println("About the object oriented programming ");
        Employee raju= new Employee();
        raju.id= 134;
        raju.name= "rojer";
        raju.salary= 89;
        System.out.println("printing the attributes");
        System.out.println(raju.id);
        System.out.println(raju.name);

        Employee jhon =new Employee();
        jhon.name="fg";
        jhon.id= 88;

        System.out.println(jhon.id);
        System.out.println(jhon.name);
    }
}

