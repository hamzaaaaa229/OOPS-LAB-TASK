class LibraryItems {
    protected
    String title;
    String authorname;
    int publicationYear;
    LibraryItems (String title, String authorname, int year, int ibsn, int publicationYear){
        this.title= title;
        this.authorname = authorname;
        this.publicationYear= publicationYear;
    }
    public void displayInfo(){
        System.out.println(" Title Name: "+ this.title );
        System.out.println(" Author Name: "+ this.authorname);
        System.out.println(" Publication Year: "+ this.publicationYear);
    }
}
class Book extends LibraryItems{
    protected
    int ibsn;
    int numberOfPages;
    Book(  String title, String authorname, int publicationYear ,int ibsn, int numberOfPages){
        super(title,  authorname, publicationYear, ibsn, publicationYear);
        this.ibsn= ibsn;
        this.numberOfPages= numberOfPages;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" IBNS: "+ this.ibsn);
        System.out.println(" Number Of Pages: "+ this.numberOfPages );
    }
}
class Magazin extends LibraryItems{
    protected
    int issueNumber;
    int month;
    String editor;
    Magazin(String title, String authorname, int publicationYear , int ibsn, int numberOfPages,int issueNumber, int month, String editor){
        super(title, authorname, publicationYear, ibsn, numberOfPages);
        this.issueNumber= issueNumber;
        this.month= month;
        this.editor= editor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Issue Number: "+ this.issueNumber);
        System.out.println(" Month: "+ this.month);
        System.out.println(" Editor: "+ this.editor);
    }
}
class ReferanceBook extends Book{
    protected
    String fieldofstudy;
    String inLendable;
    ReferanceBook(String title, String authorname, int publicationYear ,int ibsn, int numberOfPages , String fieldofstudy, String inLendable){
        super(title,authorname,publicationYear,ibsn,numberOfPages);
        this.fieldofstudy= fieldofstudy;
        this.inLendable= inLendable;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Field Of Study: "+ this.fieldofstudy);
        System.out.println(" In Lendable: "+ this.inLendable);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryItems obj = new Magazin( "  Tom Jones ", " wasi ullah asif ", 2000, 21313, 302, 212, 02, " no ");
        obj.displayInfo();
        System.out.println(" Reference book: ");
        LibraryItems obj1 = new ReferanceBook("  Tom Jones ", "  wasi ullah asif ", 2000, 21313, 302, "programmer", " no");
        obj1.displayInfo();
    }
}