package com.ironhack.AssociationOfNurses;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String district;

    @OneToOne()
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany()
    private List<Member> members;

}
