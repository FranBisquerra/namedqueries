package com.example.namedqueries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Foo.findAll",
                query = "SELECT f FROM Foo f"
        ),
        @NamedQuery (
                name = "Foo.findById",
                query = "SELECT f FROM Foo f WHERE f.id = :id"
        )
})
public class Foo {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
