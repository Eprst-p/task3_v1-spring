package io.singh1114.springboottut.school;

import javax.persistence.*;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    private String name;
    private String principle;
    private String address;

    public School() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School(long id, String name, String principle, String address) {
        super();
        this.id = id;
        this.name = name;
        this.principle = principle;
        this.address = address;
    }
}