package com.ikucuk.letgoup.category_service.core.ports.in;

import com.ikucuk.letgoup.category_service.dto.CategoryDTO;

public interface CategoryServicePort {   //CreateOrderPort

    CategoryDTO createCategory(CategoryDTO categoryDTO);

   // CategoryDTO findByCategoryId(Long id);

//    Customer getCustomer(Long id);
//    void updateCustomer(Long id, Customer customer);
//    void deleteCustomer(Long id);
}
