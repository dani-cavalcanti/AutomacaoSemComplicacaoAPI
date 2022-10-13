package entidadesMap;

import java.util.LinkedHashMap;

public class DocMap {
	private LinkedHashMap<String,Object> docMap = new LinkedHashMap<>();
	
	public DocMap(Object tipo, Object valor) {
		docMap.put("tipo", tipo);
		docMap.put("valor", valor);
	}
	
	public LinkedHashMap<String, Object> getDocMap() {
		return docMap;
	}
	
	public void setDocMap(String key, Object value) {
		docMap.put(key, value);
	}

}
