package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService ,VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner alex = new Owner("Alex", "Foster");
		ownerService.save(alex);
		
		Owner michel = new Owner("Michel", "Wilsom");
		ownerService.save(michel);
		
		System.out.println("Loaded owners ...");
		
		Vet pol = new Vet("Pol", "Lemth");
		vetService.save(pol);
		
		Vet sarah = new Vet("Sahra", "Felmen");
		
		vetService.save(sarah);
		System.out.println("Loaded vets ...");
	}

}
