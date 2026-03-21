package net.akanekodou.entity;

import java.io.Serializable;

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
public class Prefecture implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private District district;

    public Prefecture(String name, District district) {
        this.name = name;
        this.district = district;
    }
}
