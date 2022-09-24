package com.hande.competitionproje.repository.entity;

import com.hande.competitionproje.repository.enums.State;
import com.hande.competitionproje.repository.enums.UserType;
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
    String fullName;
    @Column(name = "user_name")
    String userName;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    UserType userType = UserType.USER;
    String password;
    @Embedded
    TableAdd tableAdd;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    State state = State.APPROVED;
}

    //@OneToMany(mappedBy="questionerId")
    //List<Question> questionList;
   // @ManyToOne
   // @JoinColumn(name = "competition" , referencedColumnName = "id")
    //Competition competition;
   // @OneToMany(mappedBy = "answerUser")
    //List<Answer> answerList;
    //@ManyToMany
    //@JoinColumn(name="winner", referencedColumnName = "id")
    //List<Winner> winnerList;