import java.util.Scanner;

class Course{
    protected
    int courseId;
    String courseTitle;
    int cradithour;
    Course(int courseId, String courseTitle, int cradithour){
        this.courseId= courseId;
        this.courseTitle= courseTitle;
        this.cradithour=cradithour;
    }
    public void showCourseDetails(){
        System.out.println("Course Id:" + this.courseId);
        System.out.println("Course Title:" + this.courseTitle);
        System.out.println("Cradit Houre:" + this.cradithour);
    }
}
class OnlineCourse extends Course{
    public
    String platformName;
    String instructor;
    String durationWeeks;
    OnlineCourse(int courseId, String courseTitle, int cradithour, String platformName, String instructor, String durationWeeks){
        super(courseId, courseTitle, cradithour);
        this.platformName= platformName;
        this.instructor= instructor;
        this.durationWeeks= durationWeeks;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform Name:" + this.platformName);
        System.out.println("Instructor:" + this.instructor);
        System.out.println("Duration Weeks:" + this.durationWeeks);
    }
}
class OnsiteCourse extends Course{
    public
    String location;
    int classroomNumber;
    String instructor;
    OnsiteCourse( int courseId, String courseTitle, int cradithour, String location, int classroomNumber, String instructor ){
        super(courseId,courseTitle,cradithour);
        this.location= location;
        this.classroomNumber= classroomNumber;
        this.instructor= instructor;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location:" + this.location);
        System.out.println("Class Room Number:" + this.classroomNumber);
        System.out.println("Instructor:" + this.instructor);
    }
    public void submitfeedback(){
        System.out.println("Submit Your Feedback");
    }
}







public class task2 {
    public static void main(String[] args){
        Course obj = new OnsiteCourse(2131,"OOP", 16, "Islamabad", 204, " Sir Samii");
        obj.showCourseDetails();
    }
}
