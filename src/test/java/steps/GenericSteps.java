package steps;

import io.cucumber.java.pt.Então;
import utils.RestUtils;
import static org.junit.Assert.assertEquals;

public class GenericSteps {
	@Então("o sistema devolve o campo {string} com o valor {string}")
	public void oSistemaDevolveOCampoComOValor(String key, String value) {
	    assertEquals(value, RestUtils.getResponse(key));
	}
	@Então("o sistema devolve o status {int}")
	public void oSistemaDevolveOStatus(int status) {
	    assertEquals(status, RestUtils.getStatusCode());
	}
	
}
