package com.zc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *   @创建人  zc
 *   @创建时间 2020/9/13 2:13
 *   @包名: com.zc.entity
 *   @描述：
 */

@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    private Long id;

    private String name;
}
