package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.wsdl.GetTestDetailsResponse;
import hello.wsdl.TestDetails;

@RestController
public class TestController {
    @Autowired TestClient testClient;
    @RequestMapping("/test")
    public TestDetails test(@RequestParam(value="scaleid", defaultValue="1") Integer scaleId) {

        Integer testId = 1;
        
        GetTestDetailsResponse response = testClient.getTestDetails(testId);
        TestDetails test = response.getTest();
        
        return test;
    }
}
