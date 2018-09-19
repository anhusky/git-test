import com.uu.model.User;
import org.junit.Test;

public class Main {

    @Test
    public void println() {
        User user = new User();
        user.setName("1");
        user.setDescription("ddddd");
        user.setAge(0);
        System.out.println(user.toString());
    }
}
