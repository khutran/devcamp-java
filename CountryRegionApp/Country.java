import java.util.ArrayList;

public class Country {
    private String countryCode;
    private String countryName;
    private ArrayList<Region> regions;

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.regions = new ArrayList<>();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public void addRegion(Region region) {
        this.regions.add(region);
    }

    @Override
    public String toString() {
        return "Country [code=" + countryCode + ", name=" + countryName + "]";
    }
}
