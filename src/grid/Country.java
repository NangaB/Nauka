package grid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Country {
    public String countryName;
    public Continent continentName;
    public List<String> twoNumbers;

    public Country(String countryName, Continent continentName) {
        this.countryName = countryName;
        this.continentName = continentName;
    }

    public Country(String countryName, List<String> twoNumbers) {
        this.countryName = countryName;
        this.twoNumbers = twoNumbers;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Continent getContinentName() {
        return continentName;
    }

    public void setContinentName(Continent continentName) {
        this.continentName = continentName;
    }

    public List<String> getTwoNumbers() {
        return twoNumbers;
    }

    public void setTwoNumbers(List<String> twoNumbers) {
        this.twoNumbers = twoNumbers;
    }

    public static void main(String[] args) {
        Stream<Country> countries = Stream.of(
                new Country("Poland", new Continent("Europa")),
                new Country("Holand", new Continent("Europa")),
                new Country("Om", new Continent("Azja")));


//        Map<Continent, List<Country>> countriesByContinent = countries.collect(Collectors.toMap(
//                Country::getContinentName));
    }



}
