
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

			response.getTest().getTestParts().get(0).getItemPool()
			.getPoolItems().stream().filter(q -> q.getScales().stream().filter(s -> s.getScaleName().equalsIgnoreCase("Leadership Potential")).count() > 0)
			.forEach(i -> i.getItemText().forEach(t -> System.err.println(t.getStemText())));
		};
	}
}
