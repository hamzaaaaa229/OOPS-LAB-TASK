abstract class VisitorPass{
    abstract int calculateTicketPrice(int numberOfVisitor);
}
class VIPPass extends VisitorPass{
    int price = 200;

    @Override
    int calculateTicketPrice(int numberOfVisitor) {
        System.out.println("TOTAL VIP PASS PRICE: " + (numberOfVisitor*price)+"$") ;
        return 0;
    }
}
class FamilyPass extends VisitorPass{
    int price = 150;

    @Override
    int calculateTicketPrice(int numberOfVisitor) {
        System.out.println("TOTAL FAMILY PASS PRICE: " + (numberOfVisitor*price)+"$") ;
        return 0;
    }
}
class GeneralPass extends VisitorPass{
    int price = 100;

    @Override
    int calculateTicketPrice(int numberOfVisitor) {
        System.out.println("TOTAL GENERAL PASS PRICE: " + (numberOfVisitor*price)+"$") ;
        return 0;
    }
}
public class lab102 {
    public static void main(String[] args){
        VIPPass obj1 = new VIPPass();
        obj1.calculateTicketPrice(5);
        FamilyPass obj2 = new FamilyPass();
        obj2.calculateTicketPrice(10);
        GeneralPass obj3 = new GeneralPass();
        obj3.calculateTicketPrice(15);

    }
}