
package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import hello.wsdl.GetTestDetailsRequest;
import hello.wsdl.GetTestDetailsResponse;
import hello.wsdl.AuthenticationToken;

public class TestClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(TestClient.class);

	public GetTestDetailsResponse getTestDetails(Integer testId) {
		
		AuthenticationToken authenticationToken = new AuthenticationToken();
		authenticationToken.setUsername("nait1");
		authenticationToken.setPassword("u6q7E4wO");
		authenticationToken.setPortalId(1);

		GetTestDetailsRequest request = new GetTestDetailsRequest();
		request.setTestId(testId);
		request.setAuthenticationToken(authenticationToken);

		log.info("Requesting test id: " + testId.toString());

		GetTestDetailsResponse response = (GetTestDetailsResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://ptp.psychometrics.com/ws1/psyws.wsdl", request);
		return response;
	}

}
