package StandardOfJava.Generic.GenericClassChallenge;



public class Main {

    public static void main(String[] args) {


        //park layer
        var nationalUSParks = new Park[]{
                new Park("옐로우 스톤", "44.4882, -110.5916"),
                new Park("그랜드 캐니언", "36.1085, -112.0965"),
                new Park("요세미티", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();


        System.out.println("------".repeat(15));


        //river layer
        var majorUSRivers = new River[]{
                new River("미시시피", "47.2160, -95.2348", "29.1566, -89.2495", "35.1556,-90.0659"),
                new River("미주리", "45.9239, -111.4983", "38.8146, -90.1218")

        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("콜로라도", "40.4708, -105.8286", "31.7811, -114.7724"),
                new River("델웨어","42.2026, -75.00836","39.4955, 75.5592")
        );

        riverLayer.renderLayer();
        
    }
}
