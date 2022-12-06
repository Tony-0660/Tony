package API;

import API.api.Api;
import API.classes.Mentor;
import API.classes.Teacher;

public class ApiTest {

    public static void main(String[] args) {
        String url="http://cydeo.com/mentors";
        Teacher teacher=new Teacher("Akbar",8);
        Mentor mentor=new Mentor("Bryan", 8);

        Api.get(url);
        Api.post(url,mentor);
        Api.get(url);



    }
}
