package guru.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstructCrudMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		return save(object, object.getId());
	}

}
