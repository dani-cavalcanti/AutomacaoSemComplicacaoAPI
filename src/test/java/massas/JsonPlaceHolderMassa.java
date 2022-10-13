package massas;

import java.util.ArrayList;
import java.util.List;

import entidades.Documento;
import entidades.Header;
import entidades.JsonPlaceHolder;
import entidades.Login;

public class JsonPlaceHolderMassa {
	
	public static String url = "https://jsonplaceholder.typicode.com/";
	public static String endpoint = "posts";
	public static String token = "";
	
	public static Header header = new Header(null);
	public static Login login = new Login("dani", "1385", "e78b322f-a92a-39cd-b4ec-73b9986a34ff");
	public static Documento documento = new Documento("cpf", "01088345735");
	public static List<Documento> documentos = new ArrayList<>();
	public static JsonPlaceHolder json = new JsonPlaceHolder("teste", "Dani Cavalcanti", 37, null);
	
	public static void addDocumentos() {
		documentos.add(documento);
		json.setDocumentos(documentos);
	}
	

}
