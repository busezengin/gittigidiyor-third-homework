package patika.dev.thirdhomework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import patika.dev.thirdhomework.entity.Student;
import patika.dev.thirdhomework.service.StudentService;

@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    StudentService repository;

    @Override
    public void run(String... args) throws Exception {

        repository.findAll().forEach(user -> logger.info("{}", user));

    }
}
