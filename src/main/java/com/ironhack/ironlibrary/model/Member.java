/* (C)2024 */
package com.ironhack.ironlibrary.model;

import com.ironhack.ironlibrary.model.Components.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
public class Member {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Status status;
    private String renewalDate;

}
