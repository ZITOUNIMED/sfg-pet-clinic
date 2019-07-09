package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.sfgpetclinic.services.CrudService;

public abstract class AbstructCrudMapService<T, ID> implements CrudService<T, ID>{
	private final Map<ID, T> map = new HashMap<>(); 
	
	@Override
	public T findById(ID id) {
		return map.get(id);
	}

	protected T save(T object, ID id) {
		map.put(id, object);
		return object;
	}

	@Override
	public Set<T> findAll() {
		return new HashSet<T>(map.values());
	}
	
}
