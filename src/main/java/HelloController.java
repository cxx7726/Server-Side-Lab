import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 标记为接口控制器
public class HelloController {

    // 定义GET请求接口，路径/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot 3.x! 我的第一个服务端接口";
    }
}