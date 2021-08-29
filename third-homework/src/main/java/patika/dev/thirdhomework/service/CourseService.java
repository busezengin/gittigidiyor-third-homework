package patika.dev.thirdhomework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.dao.CourseDAO;
import patika.dev.thirdhomework.entity.Course;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements BaseService<Course>{
    CourseDAO courseDao;


    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public Course findById(int id) {
        return (Course) courseDao.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return (Course) courseDao.save(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        courseDao.deleteById(id);
    }

    @Override
    @Transactional
    public Course update(Course course) {
        return (Course) courseDao.update(course);
    }
}
