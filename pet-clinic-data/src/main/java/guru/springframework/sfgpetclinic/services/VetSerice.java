package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface VetSerice {
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
