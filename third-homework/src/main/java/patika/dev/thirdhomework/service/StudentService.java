package patika.dev.thirdhomework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.dao.StudentDAO;
import patika.dev.thirdhomework.entity.Student;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService implements BaseService<Student>{
    private StudentDAO studentDao;



    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(int id) {
        return (Student) studentDao.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return (Student) studentDao.save(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return (Student) studentDao.update(student);
    }
}
