package com.hande.yarismaprojesi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "question")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    Long id;
    String question;
    @OneToOne(mappedBy = "question")
    Answer answer;
    @ManyToOne
    @JoinColumn(name = "question_user", referencedColumnName = "user_id")
    User questionUser;
    @ManyToOne
    @JoinColumn(name = "competition", referencedColumnName = "id")
    Competition competition;


}
