import java.util.Scanner;
class Country{
    void printCountryMessage() {
        System.out.println(" This is Country side  class");

    }
}
class State extends Country {
    void printStateMessage(){
        System.out.println(" This is State side  class ");
    }
}



public class km_inheritence {
    public static void main(String[] args) {

        Country countryObj = new Country();
        countryObj.printCountryMessage();
        State stateObj = new State();
        stateObj.printStateMessage();
        stateObj.printCountryMessage();
        System.out.println();
    }
}

