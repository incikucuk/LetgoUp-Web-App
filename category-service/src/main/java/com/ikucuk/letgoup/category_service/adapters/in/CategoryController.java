package com.ikucuk.letgoup.category_service.adapters.in;

import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final CategoryServicePort categoryServicePort;

    public CategoryController(CategoryServicePort categoryServicePort) {
        this.categoryServicePort = categoryServicePort;
    }

    //create category
    public void createCategory(CategoryDTO categoryDTO) {
        categoryServicePort.createCategory(categoryDTO);
    }

    @PostMapping
    public void createOrder(@RequestBody CategoryDTO categoryDTO) {
        categoryServicePort.createCategory(categoryDTO);
    }


}
