package ssv.home.itline.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssv.home.itline.model.User;
import ssv.home.itline.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
//        userRepository.save(new User(null, false, null, "This User 1", "tttabcd"));
//        userRepository.save(new User(null, false, null, "New User 2", "afgabcde"));
//        userRepository.save(new User(null, true, null, "Some User 3", "agbgcd"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }

}
