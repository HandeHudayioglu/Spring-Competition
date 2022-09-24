package com.hande.competitionproje.repository.entity;

import com.hande.competitionproje.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name = "views_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Views {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        Long userId;
        Long soruId;
        Long date;
        @Enumerated(EnumType.STRING)
        //@Builder.Default
        State state;
        @Embedded
        TableAdd tableAdd;

    }

