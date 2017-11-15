package pl.coderslab.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.dao.PersonDao;
import pl.coderslab.entity.Person;

@Component
@Transactional
public class JPAPersonDao implements PersonDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Person save(Person person) {
		em.persist(person);
		return person;
	}
}
