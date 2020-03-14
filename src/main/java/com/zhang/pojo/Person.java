package com.zhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author zhangjingfeng
 * @version 1.0
 * @date 2020/3/9 14:14
 * @Description:
 */


@Entity
@Table(name = "tb_person")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    //表示该字段是主键
    @Id
    //设置主键自增
    @GeneratedValue
    private Long id;

    @Column(length = 200,name = "names",nullable = false)
    private String name;

    @Column(length = 4,nullable = true)
    private Integer age;
}
