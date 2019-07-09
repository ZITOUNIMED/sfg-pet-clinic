package guru.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstructCrudMapService<Vet, Long> implements VetService {

	@Override
	protected Long addIdToEntity(Vet entity) {
		Long id = entitiesSize() + 1L;
		entity.setId(id);
		return id;
	}
}
