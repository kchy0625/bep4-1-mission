package com.back.global.jpa.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class BaseIdAndTimeManual {
    @Id
    private int id;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
}
