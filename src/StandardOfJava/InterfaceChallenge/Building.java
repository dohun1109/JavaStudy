package StandardOfJava.InterfaceChallenge;


enum UsageType {ENTERTAINMENT, GOVERMENT, RESIDENTIAL, SPROTS}

public class Building implements Mappable{

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }


    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPROTS -> Color.ORANGE + " " + PointMarker.PUSh_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
            
        };

    }
    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name,usage);
    }

    
}

























