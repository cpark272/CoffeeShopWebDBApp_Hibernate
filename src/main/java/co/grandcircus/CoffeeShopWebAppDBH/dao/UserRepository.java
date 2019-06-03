package co.grandcircus.CoffeeShopWebAppDBH.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.CoffeeShopWebAppDBH.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> { // Integer is primary ID

	User findByFirstName(String firstName);
	
}
