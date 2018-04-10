package com.in28minutes.database.databasedemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	/*
	 *
	 *
	 * public int deleteById(int id) { return
	 * jdbcTemplate.update("DELETE FROM person WHERE id=?", new Object[] { id }); }
	 *
	 * public int insert(Person person) { return jdbcTemplate.
	 * update("INSERT INTO person (id,name, location, birth_date) VALUES (?, ?, ?, ?)"
	 * , new Object[] { person.getId(), person.getName(), person.getLocation(), new
	 * Timestamp(person.getBirthDate().getTime()) }); }
	 *
	 * public int update(Person person) { return jdbcTemplate.
	 * update("UPDATE person SET name = ?, location = ?, birth_date = ? WHERE id = ?"
	 * , new Object[] { person.getName(), person.getLocation(), new
	 * Timestamp(person.getBirthDate().getTime()), person.getId() }); }
	 */
}
