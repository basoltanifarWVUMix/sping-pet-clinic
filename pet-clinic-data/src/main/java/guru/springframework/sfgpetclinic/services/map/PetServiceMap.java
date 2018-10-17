package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;

public class PetServiceMap extends AbstarctMapService<Pet, Long> {
	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Pet Pet) {
		super.delete(Pet);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

	@Override
	public Pet save(Long id,Pet object) {

		return super.save(id, object);
	}

}
