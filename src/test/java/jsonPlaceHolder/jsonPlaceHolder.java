package jsonPlaceHolder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.RestUtils;

class jsonPlaceHolder {

	@Test
	public void executaPost() {
		String json = "{"
				+ "    \"body\": \"teste\","
				+ "    \"nome\": \"Dani Cavalcanti\","
				+ "    \"idade\": \"37\","
				+ "    \"documentos\": ["
				+ "        {"
				+ "            \"tipo\": \"cpf\","
				+ "            \"valor\": \"01088345735\""
				+ "        }"
				+ "    ]"
				+ "}";
		
		RestUtils.setBaseUri("https://jsonplaceholder.typicode.com/");
		
		RestUtils.postRequest("posts", json);
		
		assertEquals("Dani Cavalcanti", RestUtils.getResponse("nome"));
		assertEquals("cpf", RestUtils.getResponse("documentos[0].tipo"));
		
	}

}
