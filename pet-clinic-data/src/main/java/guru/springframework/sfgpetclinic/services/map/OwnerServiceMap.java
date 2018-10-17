package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;

public class OwnerServiceMap extends AbstarctMapService<Owner, Long>  {

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

	@Override
	public Owner save(Long id,Owner object) {

		return super.save(id, object);
	}

}
