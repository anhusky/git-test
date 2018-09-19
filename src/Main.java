import com.uu.model.User;
import org.junit.Test;

public class Main {

    // 合并一下喽 😁😝
    public static void main(String[] args) {
        System.out.println("Hello World!  12345777");

    }

    @Test
    public void println() {
        User user = new User();
        user.setName("1");
        user.setDescription("fffff");
        user.setAge(0);
        System.out.println(user.toString());
        System.out.println("这里是的三个分支");
    }
}
