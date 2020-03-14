package com.zhang.dao;

import com.zhang.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhangjingfeng
 * @version 1.0
 * @date 2020/3/9 14:37
 * @Description:
 */
public interface PersonDao extends JpaRepository<Person,Long> {
        public List<Person> findByNameEquals(String name);
}
