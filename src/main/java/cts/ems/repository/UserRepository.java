package cts.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cts.ems.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
//	@Query(value = "select u from User where email=?1")
	User findUserByEmail(String email);
}
