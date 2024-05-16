package com.cydeo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isDeleted = false;

    private LocalDateTime insertDateTime;
    private Long insertUserId;
    private LocalDateTime lastUpdateDateTime;
    private Long lastUpdateUserId;

    private void onPrePersist(){
        this.insertDateTime = LocalDateTime.now();
        this.lastUpdateDateTime = LocalDateTime.now();
        this.insertUserId=1L;
        this.lastUpdateUserId=1L;
    }

    private void onPreUpdate(){
        this.lastUpdateDateTime=LocalDateTime.now();
        this.lastUpdateUserId=1L;
    }



}
