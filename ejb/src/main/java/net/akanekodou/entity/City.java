package net.akanekodou.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@Data
public class City implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private Prefecture prefecture;
    private Date designated;
    private double area;
    private int population;

    public City(
        String name,
        Prefecture prefecture,
        Date designated,
        double area,
        int population
    ) {
        this.name = name;
        this.prefecture = prefecture;
        this.designated = designated;
        this.area = area;
        this.population = population;
    }
}
