import java.util.Scanner;
class MyMainEmployee{
    private int id ;
    private String name;

    public MyMainEmployee(String myname){
        id = 89;
      name = myname;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}



        public class km_constructor {
            public static void main(String[] args) {
                System.out.println("know about the Constructor");
                Scanner sc = new Scanner(System.in);
                MyMainEmployee travis =  new MyMainEmployee("mkigfm");
                System.out.println(travis.getId());
                System.out.println(travis.getName());

                System.out.println();

            }
}