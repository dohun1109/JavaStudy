package StandardOfJava.Generic.GenericClassChallenge;

import java.util.Arrays;                     

public interface Mappable {

    void render();

    static double[] stringToLatLon(String location) {
        //주소가 넘어오면 mapping 하는 code
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat,lng};
    }


}

abstract class Point implements Mappable {
    private double[] location = new double[2];

    //기본 생성자
    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
        //interface 의 method 를 불러오는데 stringTOLatLon 은 static method 이므로 클래스명으로 접근 가능.
    }

    @Override
    public void render() {
        System.out.println("랜더링 주소 {" + this + "} 가 가리키는 곳 ->(" + location() + ")");
        //this -> instance 자신의 주소를 반환할 때 사용
    }

    private String location(){
        return Arrays.toString(location);
    }

}

abstract class Line implements Mappable {

    private double[][] locations;

    public Line(String... locations) {   //... -> 가변 매개변수; String type 의 변수를 여러개 받을 수 있다.
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("랜더링 주소 {" + this + "} 가리키는 곳 (" + locations() + ")");
    }

    private String locations(){
        return Arrays.deepToString(locations);
        //deepToString -> 이차원 이상의 배열을 출력하기 위해서는 ToString 말고 deepToString 을 사용해야함.
    }

}
