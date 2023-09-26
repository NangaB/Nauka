package grid;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car {
    private String mark;
    private int millage;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    public static final class CarBuilder{
        private String mark;
        private int millage;

        public CarBuilder mark(String mark){
            this.mark = mark;
            return this;
        }

        public CarBuilder millage(int millage){
            this.millage = millage;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.mark = this.mark;
            car.millage = this.millage;
            return car;
        }
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    public static void main(String[] args) {

        Map<String,Car> cars = Stream.of(
                Car.builder().mark("BMW").millage(10).build(),
                Car.builder().mark("Dacia").millage(10).build(),
//                Car.builder().mark("Honda").millage(0).build(),
                Car.builder().mark("Honda").millage(6666).build())
                        .collect(Collectors.toMap(Car::getMark, Function.identity()));

        for (Map.Entry<String, Car> entry: cars.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
