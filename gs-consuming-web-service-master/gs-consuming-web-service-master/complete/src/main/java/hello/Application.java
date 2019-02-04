
package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.wsdl.GetTestDetailsResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner lookup(TestClient quoteClient) {
		return args -> {
			Integer testId = 1;

			if (args.length > 0) {
				testId = Integer.parseInt(args[0]);
			}
			GetTestDetailsResponse response = quoteClient.getTestDetails(testId);
			System.err.println(response.getTest().getTestName());
		};
	}

}
