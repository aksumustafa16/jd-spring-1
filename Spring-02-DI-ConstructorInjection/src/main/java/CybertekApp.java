import com.cybertek.interfaces.Course;
import com.cybertek.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext  container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);
        Course course1 = (Course) container.getBean("selenium");

        course.getTeachingHours();
        course1.getTeachingHours();



    }
}
