
class My{
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public  int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class roger {
    public static void main(String[] args) {
        My yom =new My();
      yom.setId(58);
        System.out.println(yom.getId());
        yom.setName("thri");
        System.out.println(yom.getName());

    }
}
