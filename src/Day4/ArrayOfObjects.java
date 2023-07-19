package Day4;
interface Actor{
    String act();
}
class TomHanks implements Actor{
    @Override
    public String act() {
        return "TomHanks is acting";
    }
}
class LeonardoDiCaprio implements Actor{
    @Override
    public String act() {
        return "LeonardoDiCaprio is acting";
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Actor arr[]=new Actor[2];
        Actor tomHanks=new TomHanks();
        Actor leonardoDiCaprio=new LeonardoDiCaprio();
        arr[0]=tomHanks;
        arr[1]=leonardoDiCaprio;
        for (Actor arrItem:arr) {
            System.out.println(arrItem.act());
        }
    }
}
