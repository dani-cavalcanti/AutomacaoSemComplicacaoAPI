package viaCep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import utils.RestUtils;



public class ViaCepGetTest {
	
	static String url = "http://viacep.com.br/ws/";

	
	@BeforeAll
	public static void setResponse() {
		RestUtils.setBaseUri(url);
		String cep = "23595490";
		RestUtils.getRequest(cep+"/json");
		
	}
	
	@Test
	public void validaStatusGet() {
		RestUtils.setBaseUri(url);
				
		String cep = "23595490";
		getStatusEndereco(cep+"/json");
		
		cep = "23595060";
		String endpoint = cep+"/json";
		getStatusEndereco(endpoint);		
		
	}
	
	@Test
	public void validaLogradouro() {

		assertEquals("Rua 62", RestUtils.getResponse("logradouro"));
	}
	
	@Test
	public void validaComplemento() {
		
		assertEquals("(Cj Cesarão)", RestUtils.getResponse("complemento"));
	}
	
	@Test
	public void validaBairro() {
	   assertEquals("Santa Cruz", RestUtils.getResponse("bairro"));
	}
	
	@Test
	public void validaLocalidade() {
		assertEquals("Rio de Janeiro", RestUtils.getResponse("localidade"));
	}
	
	
	public void validaStatusCode(int status) {
		assertEquals(status,RestUtils.getStatusCode() );
	}
	
	public void getStatusEndereco(String endpoint) {
		RestUtils.getRequest(endpoint);
		System.out.println(RestUtils.getBody());
		validaStatusCode(200);
	}

}
