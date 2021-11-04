import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/11/1 18:19
 */
@ComponentScan("com.tiny.auth")
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication {
    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, args);
    }
}
