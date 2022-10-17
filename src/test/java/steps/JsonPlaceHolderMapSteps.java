package steps;

import java.util.Map;

import entidades.Header;
import entidadesMap.JsonPlaceHolderMap;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import massas.MapMassa;
import utils.RestUtils;

public class JsonPlaceHolderMapSteps {
	String url = "";
	String endpoint = "";
	String token = "";
	Header header;
	JsonPlaceHolderMap json;

	@Dado("que sejam preenchidos os campos do JsonPlaceHolderMap")
	public void queSejamPreenchidosOsCamposDoJsonPlaceHolderMap() {
		url = MapMassa.url;
		endpoint = MapMassa.endpoint;
		token = MapMassa.token;
		header = MapMassa.header;
		json = MapMassa.json;
		
		RestUtils.setBaseUri(url);
		header.setHeader("Authorization", token);

	}

	@Quando("forem alterados os campos do JsonPlaceHolderMap")
	public void foremAlteradosOsCamposDoJsonPlaceHolderMap(Map<String, Object> map) {
		json.setJsonPlaceHolderMap(map);

	}
	
	@Quando("for realizado uma requisição do tipo POST do JsonPlaceHolderMap")
	public void forRealizadoUmaRequisiçãoDoTipoPOSTDoJsonPlaceHolderMap() {
		RestUtils.postRequest(endpoint, header.getHeader(), json.getJsonPlaceHolderMap());
		System.out.println(RestUtils.getBody());

	}



}
