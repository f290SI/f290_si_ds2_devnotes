package br.com.fatecararas.f290_si_ds2_devnotes.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Note> notes = new ArrayList<>();

    public Category() {
    }

    public Category(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", description=" + description + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
