package com.ikucuk.letgoup.category_service.adapters.in;

import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final CategoryServicePort categoryServicePort;

    public CategoryController(CategoryServicePort categoryServicePort) {
        this.categoryServicePort = categoryServicePort;
    }

    //create category
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        return new ResponseEntity<>(categoryServicePort.createCategory(categoryDTO), HttpStatus.CREATED);
    }

    //getByCategoryId
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategory(@RequestParam Long id) {
        return new ResponseEntity<>(categoryServicePort.findByCategoryId(id), HttpStatus.OK);
    }


    //update category

    //delete category

    //get all categories(parent id göre getirilmelidir)

    //get all sub categories










}
