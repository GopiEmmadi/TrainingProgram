package Day3;

public class SuperHero {
    String name;
    String power;
    String superpower;

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getSuperpower() {
        return superpower;
    }

    public static void main(String[] args) {
        SuperHero ironMan=new SuperHero();
        ironMan.name="ironMan";ironMan.power="iron";ironMan.superpower="armor";
        System.out.println(ironMan.getName());
        System.out.println(ironMan.getPower());
        System.out.println(ironMan.getSuperpower());
    }
}
