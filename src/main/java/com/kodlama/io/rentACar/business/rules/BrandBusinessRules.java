package com.kodlama.io.rentACar.business.rules;

import com.kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import com.kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand name already exists");
        }

    }
}
