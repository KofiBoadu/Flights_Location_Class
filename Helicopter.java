public class Helicopter {
    private Location location;
    private double max_fuelCapacity;
    private double current_fuel ;
    private double miles_perGallon;


    public Helicopter( double max_fuelCapacity,  double miles_perGallon) {
        // This will set the starting or default location as cleveland and the coordinates for distance x 0 and distance y 0
        // The current fuel is set to full tank of Gas
        this.location = new Location("Cleveland",0,0,true);
        this.max_fuelCapacity = max_fuelCapacity;
        this.current_fuel = max_fuelCapacity;
        this.miles_perGallon = miles_perGallon;
    }


    public double getMax_fuelCapacity(){
        return this.max_fuelCapacity;
    }

    public double getMiles_perGallon(){
        return this.miles_perGallon;
    }

    public Location getLocation(){
        return  location;
    }

    public double getCurrent_fuel(){
        return this.current_fuel;
    }


    public void set_newLocation(Location new_location){
        this.location= new_location;
    }


    public void flying_to(Location final_destination){
        double distance= location.distance_toLocation(final_destination);
        if (distance > current_fuel/miles_perGallon){

            System.out.println("You can not fly to"+" "+ final_destination.getLocation_name() + "\n You do not have enough fuel");
        }
        else if (distance < current_fuel/miles_perGallon && final_destination.isHas_gas()== false){
                System.out.println("There is no gas at this location and can not fly to ");
            }

        else {
            System.out.println("You successfully flew  to "+ " "+final_destination.getLocation_name() );
        }

    }

    public void refuel(){
        if (!location.isHas_gas()){
            System.out.println("Can not fuel at "+ location.getLocation_name() + "No gas station available");
        }
        else{
            current_fuel= max_fuelCapacity;
        }
    }



}
