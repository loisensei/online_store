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
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @Column(unique = true)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private List<Product> products;

    public Brand(String name) {
        this.name = name;
    }
}
