package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;

public abstract class AbstructCrudMapService<T extends BaseEntity, ID> implements CrudService<T, ID>{
	private final Map<ID, T> map = new HashMap<>(); 
	
	@Override
	public T findById(ID id) {
		return map.get(id);
	}
	@Override
	public T save(T object) {
		if(object != null){
			ID id = addIdToEntity(object);
			map.put(id, object);
		} else {
			throw new RuntimeException("Cant save null Object!");
		}
		
		return object;
	}

	@Override
	public Set<T> findAll() {
		return new HashSet<T>(map.values());
	}
	
	protected int entitiesSize(){
		return map.size();
	}
	
	protected abstract ID addIdToEntity(T entity);
	
}
