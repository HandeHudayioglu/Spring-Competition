package com.hande.competitionproje.repository;

import com.hande.competitionproje.repository.enums.UserType;
import com.hande.competitionproje.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

   Optional<User>findByUserNameAndPassword(String userName, String password);

   /**
    * !!! DİKKAT !!!
    * Eğer Optional ile sonuç dönmek istiyorken, tek bir değer yerine veritabanından bir liste döner ise
    * exception fırlatır ve akışınızı bozar. tek kayıt geldiğinden emin olmadığınız yerlerde kullanırken dikkatli olun.
    * @param
    * @return
    */
   Optional<User> findByUserName(String userName);






}
