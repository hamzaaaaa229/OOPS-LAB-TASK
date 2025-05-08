abstract class Seat {
    abstract int Calculate_Seat_Price(int nofseats);
}

class BusinessClass extends Seat {
    int Calculate_Seat_Price(int nofseats) {
        return nofseats * 5000;
    }
}

class FirstClass extends Seat {
    int Calculate_Seat_Price(int nofseats) {
        return nofseats * 3500;
    }
}

class EconomyClass extends Seat {
    int Calculate_Seat_Price(int nofseats) {
        return nofseats * 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        BusinessClass business = new BusinessClass();
        FirstClass first = new FirstClass();
        EconomyClass economy = new EconomyClass();

        int businessPrice = business.Calculate_Seat_Price(2);
        int firstPrice = first.Calculate_Seat_Price(3);
        int economyPrice = economy.Calculate_Seat_Price(4);

        System.out.println("Business Class Total Price: " + businessPrice);
        System.out.println("First Class Total Price: " + firstPrice);
        System.out.println("Economy Class Total Price: " + economyPrice);
    }
}
