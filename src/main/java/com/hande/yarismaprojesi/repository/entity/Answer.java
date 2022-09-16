package com.hande.yarismaprojesi.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "answer")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String answer;
    @OneToOne
    @JoinColumn(name = "question", referencedColumnName = "question_id")
    Question question;
    //@ManyToOne
    //@JoinColumn(name = "answer_id", referencedColumnName = "user_id")
    //User user;
   @OneToOne
   @JoinColumn (name = "competition", referencedColumnName = "id")
    Competition competition;
}
