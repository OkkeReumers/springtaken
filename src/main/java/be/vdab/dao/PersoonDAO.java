package be.vdab.dao;

import java.io.IOException;
import java.util.List;

import be.vdab.entities.Persoon;

public interface PersoonDAO {
	List<Persoon> findAll() throws IOException;
}
