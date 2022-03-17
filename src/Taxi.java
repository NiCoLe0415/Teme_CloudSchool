public class Taxi extends Vehicle{

    int noPasagers;
    double ticketPrice;

    public Taxi(){

    }
    public Taxi(int noPasagers, double ticketPrice) {

        this.noPasagers = noPasagers;
        this.ticketPrice = ticketPrice;
    }

    public Taxi(String colour, boolean functional, int noPasagers, double ticketPrice) {
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
        return "Taxi{" +
                "noPasagers=" + noPasagers +
                ", ticketPrice=" + ticketPrice +
                ", colour='" + colour + '\'' +
                ", functional=" + functional +
                '}';
    }


}
