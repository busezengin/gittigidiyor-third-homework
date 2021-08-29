package patika.dev.thirdhomework.dao;

import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.entity.Instructor;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@AllArgsConstructor
public class InstructorDAOJPAImpl implements InstructorDAO<Instructor>{

    private CrudRepository crudRepository;


    @Override
    public List<Instructor> findAll() {
        return (List<Instructor>) crudRepository.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return crudRepository.findById(id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return (Instructor) crudRepository.save(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Instructor instructor = this.findById(id);
        crudRepository.delete(instructor);
    }

    @Override
    @Transactional
    public Instructor update(Instructor instructor) {
        return crudRepository.merge(instructor);
    }
}
