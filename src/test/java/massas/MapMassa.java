package massas;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import entidades.Header;
import entidadesMap.DocMap;
import entidadesMap.LoginMap;
import entidadesMap.JsonPlaceHolderMap;

public class MapMassa {
	
	public static String url = "https://jsonplaceholder.typicode.com/";
	public static String endpoint = "posts";
	public static String token = "";
	
	public static LoginMap login = new LoginMap("dani", "1385", "e78b322f-a92a-39cd-b4ec-73b9986a34ff");
	public static Header header = new Header(null);
	public static DocMap documento = new DocMap("cpf", "01088345735");
	public static List<LinkedHashMap<String, Object>> documentos = new ArrayList<>();
	public static JsonPlaceHolderMap json = new JsonPlaceHolderMap("teste", "Dani Cavalcanti", 37, null);
	
	public static void addDocumentos() {
		documentos.add(documento.getDocMap());
		json.setJsonPlaceHolderMap("documentos", documento);
	}

}
