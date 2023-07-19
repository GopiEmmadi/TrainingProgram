package Day4;

public class MovieStar {
    private String name;
    private int age;
    private long income;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getIncome() {
        return income;
    }
}
class Main{
    public static void main(String[] args) {

        MovieStar movieStar=new MovieStar();
        movieStar.setName("PK");movieStar.setAge(50);movieStar.setIncome(100);
        System.out.printf("name:%s\nage:%d\nincome:%d\n",movieStar.getName(),movieStar.getAge(),movieStar.getIncome());
    }
}