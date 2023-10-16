package com.exam.translation_test.service.impl;

import com.exam.translation_test.dto.TranslationDto;
import com.exam.translation_test.entity.TranslationEntity;
import com.exam.translation_test.mapper.TranslationMapper;
import com.exam.translation_test.repository.TranslationRepository;
import com.exam.translation_test.service.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class TranslationServiceImpl implements TranslationService {

    private final TranslationRepository translationRepository;
    private final TranslationMapper translationMapper;


    @Override
    public Page<TranslationDto> search(Pageable pageable) {
        Page<TranslationEntity> all = translationRepository.findAll(pageable);
        return all.map(translationMapper::toDto);
    }
}
