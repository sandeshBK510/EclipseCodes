package sandesh.SpringCrudProject.repositorry;

import org.springframework.data.jpa.repository.JpaRepository;

import sandesh.SpringCrudProject.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	

}
