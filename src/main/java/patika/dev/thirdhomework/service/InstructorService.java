package patika.dev.thirdhomework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import patika.dev.thirdhomework.dao.InstructorDAO;
import patika.dev.thirdhomework.entity.Instructor;

import java.util.List;


@Service
@RequiredArgsConstructor
public class InstructorService implements BaseService<Instructor>{

    private InstructorDAO instructorDao;


    @Override
    public List<Instructor> findAll() {
        return instructorDao.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return (Instructor) instructorDao.findById(id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return (Instructor) instructorDao.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        instructorDao.deleteById(id);
    }

    @Override
    public Instructor update(Instructor instructor) {
        return (Instructor) instructorDao.update(instructor);
    }
}
