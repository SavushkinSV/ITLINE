package ssv.home.itline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ssv.home.itline.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
