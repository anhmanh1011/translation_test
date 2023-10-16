package com.exam.translation_test.service;


import com.exam.translation_test.dto.TranslationDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TranslationService {
    Page<TranslationDto> search(Pageable pageable);
}
