package puto.collection.model;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "," + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName()) &&
                Objects.equals(getAge(), animal.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Animal o) {
        return new CompareToBuilder()
                        .append(o.getAge(),this.getAge())
                        .append(this.getName(), o.getName())
                        .toComparison();
    }
}
