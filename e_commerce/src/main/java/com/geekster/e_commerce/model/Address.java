package com.geekster.e_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aID;
    private String aName;
    private String aLandmark;
    private String aPhoneNumber;
    private String aZipCode;
    private String aState;
    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
