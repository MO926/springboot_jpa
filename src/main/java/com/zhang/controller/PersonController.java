package com.zhang.controller;

import com.zhang.dao.PersonDao;
import com.zhang.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangjingfeng
 * @version 1.0
 * @date 2020/3/9 14:39
 * @Description:
 */

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonDao personDao;

    @PostMapping("/")
    public String add(@RequestBody Person person){
        personDao.save(person);
        return "添加成功";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id,@RequestBody Person person){
        person.setId(id);
        personDao.saveAndFlush(person);
        return "修改成功";
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        personDao.deleteById(id);
        return "删除成功";
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id){
       return personDao.findById(id).get();
    }

    @GetMapping("/")
    public List<Person> findAll(){
       return personDao.findAll();
    }

    @GetMapping("findbyName")
    public List<Person> findbyName(){
        return personDao.findByNameEquals("zhangsan");
    }
}
