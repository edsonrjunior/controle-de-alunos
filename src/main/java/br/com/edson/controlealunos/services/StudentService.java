package br.com.edson.controlealunos.services;

import br.com.edson.controlealunos.entities.Student;
import br.com.edson.controlealunos.exceptions.DatabaseException;
import br.com.edson.controlealunos.exceptions.ResourceNotFoundException;
import br.com.edson.controlealunos.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    //Instanciação automática da interface
    @Autowired
    private StudentRepository studentRepository;

    //Buscar todos os alunos do banco de dados
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    //Buscar um estudante por id
    public Student findById(Long id) {
        Optional<Student> obj = studentRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    //Inserir um estudante no banco de dados
    public Student insert(Student student) {
        return studentRepository.save(student);
    }

    //Atualizar um estudante
    public Student update(Long id, Student obj) {
        try {
            Student entity = studentRepository.getOne(id);
            updateData(entity, obj);
            return studentRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    //Exluir um estudante do banco de dados
    public void delete(long id) {
        try {
            studentRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    //Método privado para utilizar apenas dentro da classe para atualizar alguns dados do estudante
    private void updateData(Student entity, Student obj) {
        entity.setName(obj.getName());
        entity.setAge(obj.getAge());
        entity.setEmail(obj.getEmail());
        entity.setGraduation(obj.getGraduation());
    }

    public List<Student> findByName(String name){
        return studentRepository.findByName(name);
    }


}
