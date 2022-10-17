package steps;

import entidadesMap.LoginMap;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import massas.MapMassa;
import utils.RestUtils;

public class TokenSteps {
	String url = "";
	String endpoint = "";
	String token = "";
	LoginMap login;
	
	@Dado("que sejam preenchidos os campos para autenticação")
	public void que_sejam_preenchidos_os_campos_para_autenticação() {
		url = MapMassa.url;
		endpoint = MapMassa.endpoint;
		login = MapMassa.login;
		
		RestUtils.setBaseUri(url);
	}

	@Quando("for realizado uma requisição do tipo POST do Token")
	public void for_realizado_uma_requisição_do_tipo_post_do_token() {
	    RestUtils.postRequest(endpoint, login);
	}

	@Então("o valor do token é armazenado")
	public void o_valor_do_token_é_armazenado() {
	    token = (String) RestUtils.getResponse("token");
	    MapMassa.token = token;
	}
	
	@Quando("for realizado uma requisição do tipo POST do Token e o valor do token é armazenado")
	public void for_realizado_uma_requisição_do_tipo_post_do_token_e_o_valor_do_token_é_armazenado() {
		this.que_sejam_preenchidos_os_campos_para_autenticação();
		this.for_realizado_uma_requisição_do_tipo_post_do_token();
		this.o_valor_do_token_é_armazenado();
	}


}
