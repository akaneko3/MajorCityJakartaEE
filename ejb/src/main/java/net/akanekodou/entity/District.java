package net.akanekodou.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@Data
public class District implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public District(String name) {
        this.name = name;
    }
}
