public abstract class Vehicle implements Comparable<Vehicle>{

    String colour;
    boolean functional;

    public Vehicle(){
        this.colour="";
        this.functional=true;
    }

    public Vehicle(String colour, boolean functional){
        this.colour=colour;
        this.functional=functional;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    abstract public double charge();
    abstract public double profit();
    abstract public String display();

    @Override
    public int compareTo(Vehicle vehicle) {

        return Double.compare(this.profit(), vehicle.profit());
    }
}
