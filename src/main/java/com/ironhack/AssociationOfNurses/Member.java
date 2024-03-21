/* (C)2024 */
package com.ironhack.AssociationOfNurses;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date renewalDate;
}
