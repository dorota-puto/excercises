package puto.collection.model;

import java.util.Objects;

public class Animal {
    private String name;
    private Integer age;
    public Animal(String name, Integer age){
       this.name=name;
       this.age=age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name +","+age;
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
}
