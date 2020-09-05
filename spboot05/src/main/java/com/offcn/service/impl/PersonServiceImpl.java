package com.offcn.service.impl;

import com.offcn.dao.PersonDao;
import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuhang
 * @date 2020/9/4 19:07
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao pd;


    @Override
    public void add(Person person) {
        pd.save(person);
    }

    @Override
    public void delete(Long id) {
            pd.deleteById(id);
    }

    @Override
    public void update(Person person) {
        pd.save(person);
    }

    @Override
    public Person getOne(Long id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
