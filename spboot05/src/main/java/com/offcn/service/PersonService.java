package com.offcn.service;

import com.offcn.pojo.Person;

import java.util.List;

/**
 * @author wuhang
 * @date 2020/9/4 19:06
 */
public interface PersonService {
    void add(Person person);
    void delete(Long id);
    void  update(Person person);
    Person getOne(Long id);
    List<Person> getAll();
}
