import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


public class Main 
{

	@SpringBootApplication
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SpringApplication.run(Main.class, args);
		ApplicationContext context = SpringApplication.run(Main.class, args)
	}

}
