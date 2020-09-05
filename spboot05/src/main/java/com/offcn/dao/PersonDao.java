package com.offcn.dao;

import com.offcn.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuhang
 * @date 2020/9/4 19:02
 */
public interface PersonDao extends JpaRepository<Person,Long> {
}
