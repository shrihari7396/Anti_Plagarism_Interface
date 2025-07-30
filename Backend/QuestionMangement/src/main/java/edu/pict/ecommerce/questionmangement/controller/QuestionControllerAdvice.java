package edu.pict.ecommerce.questionmangement.controller;

import edu.pict.ecommerce.questionmangement.exception.QuestionNotFoundException;
import edu.pict.ecommerce.questionmangement.dto.QuestionResponseDTO;
import edu.pict.ecommerce.questionmangement.mapper.QuestionMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class QuestionControllerAdvice {
    @ExceptionHandler(QuestionNotFoundException.class)
    public ResponseEntity<QuestionResponseDTO> handleQuestionNotFoundException(QuestionNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(QuestionMapper.toResponseDto(ex.getQuestion()));
    }


}

