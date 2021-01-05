package my.example.app;

public class FacilityEntity extends NamedEntity {

    private String geoCoordinates;

    public FacilityEntity() {
        super(NamedEntityType.FACILITY);
    }

    public String getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(String geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }
    
}
