package com.ironhack.EventManagementApplication;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
abstract public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private int duration;

    private String location;

    private String title;

    @OneToMany()
    private List<Guest> guests;

}