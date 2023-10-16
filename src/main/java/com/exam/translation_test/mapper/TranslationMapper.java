package com.exam.translation_test.mapper;

import com.exam.translation_test.dto.TranslationDto;
import com.exam.translation_test.entity.TranslationEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TranslationMapper {
    TranslationEntity toEntity(TranslationDto translationDto);

    TranslationDto toDto(TranslationEntity translationEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TranslationEntity partialUpdate(TranslationDto translationDto, @MappingTarget TranslationEntity translationEntity);
}