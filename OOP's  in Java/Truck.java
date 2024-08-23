public class Vehicle{
    private String licensePlate;
    private String type;

    public Vehicle(String licensePlate,String type){
        this.licensePlate=licensePlate;
        this.type=type;
    }
    public String getLicensePlate(String licensePlate){
        return licensePlate;
    }
    public String getType(String type){
        return type;
    }
    public String toString() {
        return "Vehicle number is "+licensePlate+" & type of board is "+type+".";
    }

    
    
}

public class Truck extends Vehicle {

    private double capacity;

    public Truck(String capacity){
        this.capacity=capacity;
    }

    public double getCapacity(double capacity){
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"\n And with the capable Capacity of "+capacity+"tons.";
    }
    
    
        public static void main(String args[]){
            Truck truckOne=new Truck();

            truckOne.getLicensePlate("TN 15 M 6155");
            truckOne.getType("WHITE BOARD");

            truckOne.getCapacity(23.3);

            System.out.println(truckOne);


        }




}



