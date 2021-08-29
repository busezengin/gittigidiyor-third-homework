package patika.dev.thirdhomework.dao;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.entity.Course;

import java.util.List;
import java.util.Optional;


@Repository
@AllArgsConstructor
public class CourseDAOJPAImpl implements CourseDAO<Optional> {

private CrudRepository crudRepository;

@Override
public List<Optional> findAll() {
        return (List<Optional>) crudRepository.findAll();
        }

@Override
public Optional findById(int id) {
        return crudRepository.findById(id);
        }

@Override
@Transactional
public Optional save(Optional course) {
        return (Optional) crudRepository.save(course);
        }

@Override
@Transactional
public void deleteById(int id) {
        Optional course = this.findById(id);
        crudRepository.delete(course);
        }

@Override
@Transactional
public Optional update(Optional course) {
        return (Optional) crudRepository.save(course);
        }
}
