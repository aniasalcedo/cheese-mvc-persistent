package org.launchcode.controllers;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Repository
    @Transactional
    public interface CategoryDao extends CrudRepository<Category, Integer> {
    }
}
