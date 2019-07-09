package guru.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstructCrudMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet object) {
		return save(object, object.getId());
	}

}
