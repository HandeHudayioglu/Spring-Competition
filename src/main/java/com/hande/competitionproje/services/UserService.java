package com.hande.competitionproje.services;

import com.hande.competitionproje.dto.request.DoLoginRequestDto;
import com.hande.competitionproje.dto.request.RegisterRequestDto;
import com.hande.competitionproje.mapper.IUserMapper;
import com.hande.competitionproje.repository.UserRepository;
import com.hande.competitionproje.repository.entity.User;
import com.hande.competitionproje.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {

     private final UserRepository userRepository;

     IUserMapper userMapper = IUserMapper.INSTANCE;

    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public Optional<User> doLogin(DoLoginRequestDto doLoginDto) {
        return userRepository.findByUserNameAndPassword(doLoginDto.getUserName(), doLoginDto.getPassword());                      //repoya soruyor bu username ve şifreye sahip useri bul eğer varsa optional olarak dönüyor
    }

    public boolean register(RegisterRequestDto dto){
        Optional<User>user = userRepository.findByUserName(dto.getUserName());
        if(user.isPresent())  return  false;                                                                                      //Eğer kullanıcı kayıtlı ise kayıt yapılamayıp false döner.
        /*
        userRepository.save(User.builder()
                .fullName(dto.getFullName())
                .userName(dto.getUserName())
                .password(dto.getPassword())
                .build());

    */

        save(IUserMapper.INSTANCE.toUser(dto));
        return true;
    }




}
