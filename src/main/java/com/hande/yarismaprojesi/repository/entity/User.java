package com.hande.yarismaprojesi.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "user_table")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long id;
    @Column(name = "first_name",nullable = false)
    String firstName;
    @Column(name = "last_name",nullable = false)
    String lastName;
    @Column(name = "user_name", nullable = false,length = 50)
    String userName;
    @Enumerated(EnumType.STRING)
    private UserType type;
    @Column(nullable = false,length = 20)
    String password;
    @OneToMany(mappedBy="questionUser")
    List<Question> questionList;
    @ManyToOne
    @JoinColumn(name = "competition" , referencedColumnName = "id")
    Competition competition;

    //List<Answer> answerList


}
