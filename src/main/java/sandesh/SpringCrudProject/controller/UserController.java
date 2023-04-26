package sandesh.SpringCrudProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sandesh.SpringCrudProject.model.User;
import sandesh.SpringCrudProject.repositorry.UserRepository;

@RestController 
public class UserController {
	 
	@Autowired
	private UserRepository userRepository;
	 
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser(newUser));
	}
	

}
