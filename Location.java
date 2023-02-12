public class Location {
    private String location_name;
    private double x_coordinates;
    private double y_coordinates;
    private boolean has_gas;


    public Location(String location_name, double x_coordinates, double y_coordinates, boolean has_gas) {
        this.location_name = location_name;
        this.x_coordinates = x_coordinates;
        this.y_coordinates = y_coordinates;
        this.has_gas = has_gas;


    }


    public String getLocation_name(){
        return this.location_name;
    }

    public boolean isHas_gas(){
        return this.has_gas;
    }


    public double distance_toLocation(Location theOther_Location){
//         xdifference=(x-coordinates- theotherLocation.x-coordinates
//         ydifference=( y-coordinates- theotherLocation.y-coordinates
//         (Using the pythogoras theorem we need to find the square )
//         (xdifference)**xdifference)
//         (ydifference ** ydifference)
//         sum of xdifference and ydifference
//        find the squareroot of the sum

        double x_coordinates_difference= x_coordinates- theOther_Location.x_coordinates;
        double y_coordinates_difference= y_coordinates- theOther_Location.y_coordinates;
        double x_coordinatesSquare= x_coordinates_difference * x_coordinates_difference;
        double y_coordinatesSquare= y_coordinates_difference * y_coordinates_difference;
        double sum_of_xyCoordinates= x_coordinatesSquare + y_coordinatesSquare;
        return Math.sqrt(sum_of_xyCoordinates);


    }


    @Override
    public String toString() {
        return "Location[ name="+ this.location_name + "\nxCoordinate="+ this.x_coordinates + "\nyCoordinates=" + this.y_coordinates+ "\nhas_gasAvailable="+this.has_gas + "]";
    }


}
