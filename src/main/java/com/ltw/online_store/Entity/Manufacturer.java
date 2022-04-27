package com.ltw.online_store.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "manufacturer")
    private List<Product> products;

    public Manufacturer(String name) {
        this.name = name;
    }
}
