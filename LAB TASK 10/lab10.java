interface display{
    void show();
}
interface aircraft extends display{
    void  aircrafttype();
    void calculatecapicty();

}
class passengersjet implements aircraft{
    int rows =5;
    int seatsperrows=5;
    String aircrafttype=" passengerjet";
    @Override
    public void aircrafttype() {
        System.out.println("aircrafttype:" + aircrafttype);
    }

    @Override
    public void calculatecapicty() {
        int capacity = rows*seatsperrows;
        System.out.println("total seats:"+  capacity);
    }
    public void show() {
        System.out.println("Details:");
        aircrafttype();
        calculatecapicty();
    }
}
class cargoplane implements aircraft{
    int length = 5;
    int width= 5;
    String aircrafttype=" cargoplane";
    @Override
    public void aircrafttype() {
        System.out.println("aircrafttype:" + aircrafttype);
    }

    @Override
    public void calculatecapicty() {
        int capacity= length*width;
        System.out.println("total capicity:"+ capacity );
    }
    public void show() {
        System.out.println("Details:");
        aircrafttype();
        calculatecapicty();
    }
}
class privatejet implements aircraft{
    int seats= 5;
    String aircrafttype=" privatejet";
    @Override
    public void aircrafttype() {
        System.out.println("aircrafttype:" + aircrafttype);
    }
    @Override
    public void calculatecapicty() {
        System.out.println("total capacity:"+ seats);

    }

    @Override
    public void show() {
        System.out.println("Details:");
        aircrafttype();
        calculatecapicty();
    }
}

public class lab10 {
    public static void main (String[] args){
        passengersjet obj = new passengersjet();
        obj.show();
        cargoplane obj2 = new cargoplane();
        obj2.show();
        privatejet obj3 = new privatejet();
        obj3.show();


    }
}
