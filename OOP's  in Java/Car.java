
//    USING CLASS AND OBJECT :
class Car{
    
        private String model;
        private String manufacturer;
        private int year;
        private double price;
    
    public void set(String model,String manufacturer,int year,double price){
        this.model=model;
        this.manufacturer=manufacturer;
        this.year=year;
        this.price=price;
    }
   
    public void getter(){
        System.out.println("Car model is : "+model);
        System.out.println("Manufactured  by : "+manufacturer);
        System.out.println("Manufactured year is : "+year);
        System.out.println("The price of the car is : "+price);

    }

    public String toString(){
        return "Car [model is  "+model+", manufactured by "+manufacturer+", and year of "+year+", price is "+price+" ]";
    }

  

}

class Usergets{
    public static void main(String args[]){
        Car  car1= new Car();
        Car  car2= new Car();

        car1.set("Verna","HYUNDAI",2018,1108999.8);
        car2.set("Verna Doup","HYUNDAI doup",2018,1108.8);

       // car1.getter();
       // car2.getter();

        System.out.println(car1);
    }

}