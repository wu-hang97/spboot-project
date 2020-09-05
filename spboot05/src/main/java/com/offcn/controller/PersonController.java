package com.offcn.controller;

import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wuhang
 * @date 2020/9/4 19:10
 */
@Controller
@RequestMapping("/manageruser")
public class PersonController {

    @Autowired
    private PersonService personService;

    /***
     * 获取全部用户信息
     *
     * @return
     */
    @GetMapping("/")
    public String getUserList(Model model) {
        List<Person> list = personService.getAll();
        model.addAttribute("page", list);
        return "user/list";
    }

    /***
     * 跳转到新增用户界面
     *
     * @param
     * @return
     */
    @RequestMapping("/toAdd")
    public String toadd() {
        return "user/userAdd";
    }

    /***
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping("/add")
    public String createUser( Person person) {
        personService.add(person);
        return "redirect:/manageruser/";
    }

    @RequestMapping("/toEdit/{id}")
    public String toEdit(Model model, @PathVariable("id") Long id) {
        Person person = personService.getOne(id);
        model.addAttribute("person", person);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(Person person) {
        personService.update(person);
        return "redirect:/manageruser/";
    }

    /***
     * 删除指定id用户
     *
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        personService.delete(id);
        return "redirect:/manageruser/";

    }

}
