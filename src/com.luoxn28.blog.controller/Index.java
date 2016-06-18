package com.luoxn28.blog.controller;

import com.luoxn28.blog.dao.Blog;
import com.luoxn28.blog.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Index控制器
 * @author luoxn28
 * @date 2016.6.18
 */
@Controller
@RequestMapping
public class Index {

    // blog表操作类
    @Autowired
    private BlogDao blogDao;

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        List<Blog> blogs = blogDao.getAll();

        map.put("blogs", blogs);
        return "index";
    }
    @RequestMapping("/")
    public String index0(Map<String, Object> map) {
        return index(map);
    }

}
