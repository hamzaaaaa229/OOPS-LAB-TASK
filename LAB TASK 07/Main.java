 class Person
 {
    String personName;
    int age;
    public Person(String name, int age)
    {
        this.personName = name;
        this.age = age;
    }
    public void print()
    {
        System.out.println("Person Name: " + personName + ", Age: " + age);
    }
}
class Patient extends Person
{
    String diseaseType;
    String recommendedMedicine;
    public Patient(String name, int age, String disease, String medicine)
    {
        super(name, age);
        this.diseaseType = disease;
        this.recommendedMedicine = medicine;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println("Disease Type: " + diseaseType + ", Recommended Medicine: " + recommendedMedicine);
    }
}
class MedicarePatient extends Patient
{
    String hospitalName;
    String wardName;
    int roomNumber;
    public MedicarePatient(String name, int age, String disease, String medicine,
                           String hospital, String ward, int room) {
        super(name, age, disease, medicine);
        this.hospitalName = hospital;
        this.wardName = ward;
        this.roomNumber = room;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println("Hospital Name: " + hospitalName + ", Ward Name: " + wardName + ", Room Number: " + roomNumber);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Patient patient = new Patient("Alice", 30, "Flu", "Tamiflu");
        MedicarePatient medicarePatient = new MedicarePatient("Bob", 65, "Pneumonia", "Antibiotics", "City Hospital", "Ward A", 101);
        Person person1 = patient;
        Person person2 = medicarePatient;
        System.out.println("Calling print() for patient object via base class reference:");
        person1.print();

        System.out.println("\nCalling print() for medicarePatient object via base class reference:");
        person2.print();
    }
}
