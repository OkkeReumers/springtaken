package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.dao.PersoonDAO;
import be.vdab.entities.Persoon;

/*@Service*/
class PersoonServiceImpl implements PersoonService {
	private final PersoonDAO persoonDAO;

	/*@Autowired*/
	PersoonServiceImpl(/*@Qualifier("CSVFormaat") */PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		return persoonDAO.findAll();
	}

}
