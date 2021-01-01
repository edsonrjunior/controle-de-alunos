package br.com.edson.controlealunos.resources;

import br.com.edson.controlealunos.entities.Student;
import br.com.edson.controlealunos.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

//

@RestController
@RequestMapping(value = "/students")
public class StudentResource {

    @Autowired
    public StudentService studentService;


    @PostMapping
    public ResponseEntity<Student> insert(@RequestBody Student obj) {
        obj = studentService.insert(obj);

        //Configuração para criar com código http 201.
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId())
                .toUri();

        return ResponseEntity
                .created(uri)
                .build();
    }

    @PutMapping
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student obj) {
        studentService.update(id, obj);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        Student obj = studentService.findById(id);
        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        List<Student> listOfStudents = studentService.findAll();
        return ResponseEntity.ok().body(listOfStudents);
    }

    @GetMapping(value = "/name")
    public ResponseEntity<List<Student>> findByName(@RequestParam(value = "name", defaultValue = "") String name) {
        List<Student> listOfStudents = studentService.findByName(name);
        return ResponseEntity.ok().body(listOfStudents);
    }


}



