package com.hande.competitionproje.utility;

import com.hande.competitionproje.repository.UserRepository;
import com.hande.competitionproje.repository.entity.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AdminImpl {

    private final UserRepository userRepository;

    public AdminImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

        Optional<User> user = this.userRepository.findByUserNameAndPassword("admin", "admin");
        if (user.isEmpty())
            this.userRepository.save(User.builder()
                    .userName("admin")
                    .password("admin")
                    .fullName("director")
                    .build());
    }
}
