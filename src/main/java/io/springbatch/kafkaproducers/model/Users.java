package io.springbatch.kafkaproducers.model;

public class Users {
    private Long id;
    private String name;
    private double sal;

    public Users(Long id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
