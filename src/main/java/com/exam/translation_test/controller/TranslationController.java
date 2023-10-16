package com.exam.translation_test.controller;

import com.exam.translation_test.dto.CommonResponse;
import com.exam.translation_test.dto.TranslationDto;
import com.exam.translation_test.service.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/translations")
@AllArgsConstructor
public class TranslationController {

    private TranslationService translationService;

    @GetMapping()
    public CommonResponse<Page<TranslationDto>> search(Pageable pageable){
        Page<TranslationDto> data = translationService.search(pageable);
        return CommonResponse.ok(data);
    }
}
