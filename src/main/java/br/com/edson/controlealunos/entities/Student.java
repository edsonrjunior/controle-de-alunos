package br.com.edson.controlealunos.entities;

import br.com.edson.controlealunos.enums.Graduation;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
//@Table(name = "tb_student")
//@NamedQuery(name = "Student.findByName", query = "select u from Student u where u.name like ?1 " )
public class Student implements Serializable {

    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer graduation;

    public Student() {
    }

    public Student(Long id, String name, Integer age, String email, Graduation graduation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        setGraduation(graduation);
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Graduation getGraduation(){
        return Graduation.valueOf(graduation);
    }

    public void setGraduation(Graduation graduation){
        if (graduation != null){
            this.graduation = graduation.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}