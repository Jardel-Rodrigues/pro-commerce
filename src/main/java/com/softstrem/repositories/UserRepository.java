package com.softstrem.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softstrem.entities.User;
import com.softstrem.projections.UserDetailsProjection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(nativeQuery = true, value = """
			SELECT pro_commerce.tb_user.email AS username, pro_commerce.tb_user.password, pro_commerce.tb_role.id AS roleId, pro_commerce.tb_role.authority
			FROM pro_commerce.tb_user
			INNER JOIN pro_commerce.tb_user_role ON pro_commerce.tb_user.id = pro_commerce.tb_user_role.user_id
			INNER JOIN pro_commerce.tb_role ON pro_commerce.tb_role.id = pro_commerce.tb_user_role.role_id
			WHERE tb_user.email = :email
			""")
	List<UserDetailsProjection> searchUserAndRolesByEmail(String email);

	Optional<User> findByEmail(String email);

}
