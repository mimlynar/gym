package com.mmlynarczyk.gym;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @OneToOne
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
    Address address;
}
