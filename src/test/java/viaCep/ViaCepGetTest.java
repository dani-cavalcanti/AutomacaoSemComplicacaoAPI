package viaCep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ViaCepGetTest {
	
	static String url = "http://viacep.com.br/ws/";
	static Response response;
	
	@BeforeAll
	public static void setResponse() {
		baseURI = url;
		String cep = "23595490";
		response = getDadosEndereco(cep);
		
	}
	
	@Test
	public void validaStatusGet() {
		baseURI = url;
		
		String cep = "23595490";
		getStatusEndereco(cep);
		
		cep = "23595060";
		getStatusEndereco(cep);

		cep = "04055041";
		getStatusEndereco(cep);
		
		
	}
	
	@Test
	public void validaLogradouro() {

		assertEquals("Rua 62", getResponse("logradouro"));
	}
	
	@Test
	public void validaComplemento() {
		
		assertEquals("(Cj Cesarão)", getResponse("complemento"));
	}
	
	@Test
	public void validaBairro() {
	   assertEquals("Santa Cruz", getResponse("bairro"));
	}
	
	@Test
	public void validaLocalidade() {
		assertEquals("Rio de Janeiro", getResponse("localidade"));
	}
	
	public Object getResponse(String key) {
		return response.getBody().jsonPath().get(key);
	}
	
	private static Response getDadosEndereco(String cep) {
		return when()
				.get(cep+"/json")
				.then()
				.extract()
				.response();
	}

	private void getStatusEndereco(String cep) {
		given()
		.when()
		.get(cep+"/json")
		.then()
		.statusCode(200);
	}

}
