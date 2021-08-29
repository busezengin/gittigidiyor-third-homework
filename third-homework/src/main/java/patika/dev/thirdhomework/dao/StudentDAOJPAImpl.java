package patika.dev.thirdhomework.dao;

import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.entity.Student;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDAOJPAImpl implements StudentDAO<Student>{

    private CrudRepository crudRepository;


    @Override
    public List<Student> findAll() {
        return crudRepository.createQuery("FROM Student s",Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return crudRepository.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return (Student) crudRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student = this.findById(id);
        crudRepository.delete(student);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return crudRepository.save(student);
    }
}
