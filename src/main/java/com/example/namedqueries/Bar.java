package com.example.namedqueries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(
        name = "Bar.findAll",
        query = "SELECT b FROM Foo b"
)
@NamedQuery (
        name = "Bar.findById",
        query = "SELECT b FROM Foo b WHERE b.id = :id"
)
public class Bar {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

