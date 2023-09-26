package grid;

public class Continent {
    public String continentName;
    public int years;
    public String gender;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public Continent(String continentName, int years, String gender) {
        this.continentName = continentName;
        this.years = years;
        this.gender = gender;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", years=" + years +
                ", gender='" + gender + '\'' +
                '}';
    }
}
