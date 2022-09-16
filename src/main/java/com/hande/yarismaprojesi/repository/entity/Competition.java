package com.hande.yarismaprojesi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "competition")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany(mappedBy = "competition")
    List<Question> questionList;
    @OneToOne
    @JoinColumn(name = "answer", referencedColumnName = "answer")
    Answer answer;
    @OneToMany(mappedBy = "competition")
    List<User>userList;
    //@OneToMany(mappedBy = "")
    //List<User>winnerList;

}
