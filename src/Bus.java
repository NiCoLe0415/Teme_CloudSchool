public class Bus extends Vehicle{

    int noPasagers;
    double ticketPrice;

    public Bus(){

    }

    public Bus(int noPasagers, double ticketPrice) {
        this.noPasagers = noPasagers;
        this.ticketPrice = ticketPrice;
    }

    public Bus(String colour, boolean functional, int noPasagers, double ticketPrice) {
        super(colour, functional);
        this.noPasagers = noPasagers;
        this.ticketPrice = ticketPrice;
    }


    @Override
    public double charge() {
        return this.ticketPrice;
    }

    @Override
    public double profit() {
        if(this.functional){
            double profitForOneTicket= 0.25*charge();
            return profitForOneTicket*this.noPasagers;
        }
        else return 0;

    }

    @Override
    public String display() {
        return "Bus{" +
                "noPasagers=" + noPasagers +
                ", ticketPrice=" + ticketPrice +
                ", colour='" + colour + '\'' +
                ", functional=" + functional +
                '}';
    }


}
