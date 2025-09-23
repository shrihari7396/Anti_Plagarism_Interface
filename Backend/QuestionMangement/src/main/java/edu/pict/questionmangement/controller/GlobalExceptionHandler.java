package edu.pict.questionmangement.controller;

import edu.pict.questionmangement.exception.QuestionNotFoundException;
import edu.pict.questionmangement.dto.questionServiceDto.QuestionResponseDTO;
import edu.pict.questionmangement.mapper.QuestionMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(QuestionNotFoundException.class)
    public ResponseEntity<QuestionResponseDTO> handleQuestionNotFoundException(QuestionNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(QuestionMapper.toResponseDto(ex.getQuestion()));
    }


}
