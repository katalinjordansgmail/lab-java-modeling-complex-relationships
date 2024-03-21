/* (C)2024 */
package com.ironhack.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "chapters")
@Data
@NoArgsConstructor
public class Chapter {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String district;
    private Member president;
    private List<Member> members;

}
