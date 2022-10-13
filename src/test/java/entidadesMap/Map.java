package entidadesMap;

import java.util.LinkedHashMap;
import java.util.List;

public class Map {
	private LinkedHashMap<String, Object> map = new LinkedHashMap<>();
	
	public Map(Object body, Object nome, Object idade, List<LinkedHashMap<String, Object>> documentos) {
		map.put("body", body);
		map.put("nome", nome);
		map.put("idade", idade);
		map.put("documentos", documentos);
	}
	
	public LinkedHashMap<String, Object> getMap(){
		return map;
	}
	
	public void setMap(String key, Object value) {
		map.put(key, value);
	}

}
