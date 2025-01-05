package org.isemri.full.service;


import org.isemri.full.model.User;
import org.isemri.full.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder(); // BCrypt şifreleme için
    }

    public void registerUser(User user) {
        String rawPassword = user.getPassword();
        String hashedPassword = passwordEncoder.encode(rawPassword);
        user.setPassword(hashedPassword);

        userRepository.save(user); // Şifreyi hashledikten sonra kullanıcıyı kaydet
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        // Yeni kullanıcı eklerken version değeri genellikle null olmalıdır
        return userRepository.save(user);
    }


    public boolean validateUser(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getPassword().equals(password);  // Şifreyi kontrol et
        }

        return false;  // Kullanıcı bulunamazsa, false döndür
    }



    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}