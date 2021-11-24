package com.mmlynarczyk.gym;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Value
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

}
