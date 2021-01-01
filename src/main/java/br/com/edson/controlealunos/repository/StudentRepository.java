package br.com.edson.controlealunos.repository;

import br.com.edson.controlealunos.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//Interface que faz conexão com o banco de dados

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  @Query("select u from Student u where u.name like ?1")
    List<Student> findByName(String name);

}
