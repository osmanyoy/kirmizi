package com.metod.ws.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.metod.ws.rest.model.Person;

/**
 * Session Bean implementation class PersonDAO
 */
@Stateless
@LocalBean
public class PersonDAO {
    @PersistenceContext(unitName = "WSProject")
    private EntityManager entityManager;

    // @PersistenceUnit(unitName = "WSProject")
    // private EntityManagerFactory entityManagerfactory;

    /**
     * Default constructor.
     */
    public PersonDAO() {
        // TODO Auto-generated constructor stub
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void insert2(final Person person) {
        this.entityManager.joinTransaction();

        this.entityManager.getTransaction()
                          .begin();
        try {
            this.entityManager.persist(person);
            this.entityManager.getTransaction()
                              .commit();
        } catch (Exception e) {
            this.entityManager.getTransaction()
                              .rollback();
        } finally {
            this.entityManager.close();
        }
    }

    public void insert(final Person person) {
        this.entityManager.persist(person);
    }

    public void delete(final Person person) {
        Person mergedPerson = this.entityManager.merge(person);
        this.entityManager.remove(mergedPerson);
    }

    public void update(final Person person) {
        Person mergedPerson = this.entityManager.merge(person);
    }

    public Person getPerson(final long personId) {
        return this.entityManager.find(Person.class,
                                       personId);
    }

    public List<Person> getAllPerson() {
        Query createQuery = this.entityManager.createQuery("select p from Person p");
        List resultList = createQuery.getResultList();
        return resultList;
    }
}
