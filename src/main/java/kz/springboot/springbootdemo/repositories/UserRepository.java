package kz.springboot.springbootdemo.repositories;

import kz.springboot.springbootdemo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);
}
