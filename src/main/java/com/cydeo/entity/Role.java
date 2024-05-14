package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role extends BaseEntity {

    private String description;

}
