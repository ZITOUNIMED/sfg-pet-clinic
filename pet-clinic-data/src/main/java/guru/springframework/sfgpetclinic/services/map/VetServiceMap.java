package guru.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstructCrudMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return save(object, object.getId());
	}

}
