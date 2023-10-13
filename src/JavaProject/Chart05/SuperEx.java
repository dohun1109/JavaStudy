package JavaProject.Chart05;

class PointEx{
    private  int x,y;
    public PointEx(){
        this.x = this.y = 0;
    }
    public PointEx(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPointEx(){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint1 extends PointEx{
    private  String color;
    public ColorPoint1(int x, int y,String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPointEx();
    }
}
public class SuperEx {
    public static void main(String[] args) {
        ColorPoint1 cp = new ColorPoint1(5,6,"blue");
        cp.showColorPoint();
    }
}
