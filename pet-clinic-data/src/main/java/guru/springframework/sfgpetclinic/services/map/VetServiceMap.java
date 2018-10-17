package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;

public class VetServiceMap  extends AbstarctMapService<Vet, Long>{
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Vet Vet) {
		super.delete(Vet);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

	@Override
	public Vet save(Long id,Vet object) {

		return super.save(id, object);
	}

}
