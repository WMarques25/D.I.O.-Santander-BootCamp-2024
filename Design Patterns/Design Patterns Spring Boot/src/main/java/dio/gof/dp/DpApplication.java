package dio.gof.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>Projeto Spring Boot</b>
 * 
 * <p>Modulos:
 * <p>- Spring Data JPA
 * <p>- Spring Web
 * <p>- OpenFeign
 * <p>- H2 Database
 * 
 * @author <a href="https://github.com/wmarques25">WMarques25</a>
 */
@EnableFeignClients
@SpringBootApplication
public class DpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpApplication.class, args);
	}

}
