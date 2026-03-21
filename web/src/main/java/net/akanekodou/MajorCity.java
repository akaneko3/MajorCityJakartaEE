package net.akanekodou;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import net.akanekodou.dao.CityDAO;
import net.akanekodou.entity.City;

@SuppressWarnings("serial")
@Named("majorCity")
@SessionScoped
public class MajorCity implements Serializable {
    @Inject
    private CityDAO dao;
    private List<City> cities;
    private City city;

    @PostConstruct
    private void init() {
        cities = dao.all();
    }

    public List<City> getCities() {
        return cities;
    }
    public City getCity() {
        return city;
    }

    public String detail(int id) {
        city = dao.find(id);
        return "detail";
    }
}