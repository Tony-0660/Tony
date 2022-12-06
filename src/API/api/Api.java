package API.api;


import API.classes.Mentor;
import API.classes.Student;
import API.classes.Teacher;
import API.database.Database;

public class Api extends Database {


    public static void get(String url) {
        if (url.endsWith("/teachers")){
            System.out.println(teachers);
        } else if (url.endsWith("/students")) {
            System.out.println(students);

        } else if (url.endsWith("/mentors")) {
            System.out.println(mentors);
        }else {
            System.out.println("404 Not Found");
        }
    }

    public static void post(String url, Object obj) {

        if (url.endsWith("/teachers")){
            teachers.add((Teacher) obj);
        } else if (url.endsWith("/students")) {
            students.add((Student) obj);

        } else if (url.endsWith("/mentors")) {
            mentors.add((Mentor) obj);
        }else {
            System.out.println("404 Not Found");
        }

    }
}
