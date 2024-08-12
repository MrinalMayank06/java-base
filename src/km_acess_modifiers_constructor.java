class MyEmployee{
  private   int id;
  private String name;

  public String getName(){
      return name;
  }
    public int getId(){
        return id;
    }
    public void setId(int i){

      id=i;
      if (i<=56){
          System.out.println("then you are in cue");
      }
      else {

          System.out.println(" its not in it");
      }

    }
    public void setName(String n){
        name=n;

    }

}
public class km_acess_modifiers_constructor {
    public static void main(String[] args) {
    MyEmployee rajon = new MyEmployee();
    rajon.setName("cunning rajon");
        System.out.println(rajon.getName());
    rajon.setId(59);
        System.out.println(rajon.getId());
    }

}
