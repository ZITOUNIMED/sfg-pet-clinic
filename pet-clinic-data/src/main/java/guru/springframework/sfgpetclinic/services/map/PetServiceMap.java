package guru.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstructCrudMapService<Pet, Long> implements PetService {

	@Override
	protected Long addIdToEntity(Pet entity) {
		Long id = entitiesSize() + 1L;
		entity.setId(id);
		return id;
	}

}
