package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public  String startEngine(){
        System.out.println("ClassName: "+getClass().getSimpleName());
        return  getName()+ " starting engine.";
    }
    public String drive(){
       runEngine(this);
      return getName() + " is driving..";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
           double avgKmPerCharge =  ((ElectricCar) carSkeleton).getAvgKmPerCharge();
           int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric.");
        } else if (carSkeleton instanceof  HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The car engine is starting with hybrid.");

        } else if (carSkeleton instanceof  GasPoweredCar) {
            GasPoweredCar gasPoweredCar= (GasPoweredCar) carSkeleton;
            System.out.println("The car engine is starting with gasPowered.");


        }else {
            System.out.println("invalid car type!");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
