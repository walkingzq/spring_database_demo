package spring.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.demo.entity.User;

import java.util.List;

/**
 * Created by qaa on 2017/7/11.
 */

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByNameAndAge(String name, Integer age);
    User getByAge(Integer age);

//    @Query
//    List<User> query();

}