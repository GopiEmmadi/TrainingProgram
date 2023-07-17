package Day3;

public class MethodOverriding {
    public static void main(String[] args) {
        Villain joker=new Villain();
        System.out.println(joker.speak());
    }
}
class Charater{
    String speak(){
        return "I am character!";
    }
}
class Villain extends Charater{
    String speak(){
        return "I am a villain!";
    }
}
