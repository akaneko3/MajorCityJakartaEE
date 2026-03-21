package net.akanekodou.dao;

import java.util.List;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import net.akanekodou.entity.City;

@Stateless
@LocalBean
public class CityDAO {
    @PersistenceContext
    private EntityManager manager;

    public List<City> all() {
        Query query = manager.createQuery("SELECT c FROM City c");
        @SuppressWarnings("unchecked")
        List<City> result = query.getResultList();
        return result;
    }

    public City find(int id) {
        return manager.find(City.class, id);
    }
}
