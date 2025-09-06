package edu.pict.questionmangement.controller;

import edu.pict.questionmangement.dto.questionServiceDto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.questionServiceDto.QuestionResponseDTO;
import edu.pict.questionmangement.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequestMapping("/questions/admin")
public class AdminQuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping(value = "/addQuestion", consumes = {"multipart/form-data"})
    public QuestionResponseDTO addQuestion(
            @RequestPart("question") QuestionRequestDTO questionRequestDTO,
            @RequestPart("file") MultipartFile file) {

        return questionService.addQuestion(questionRequestDTO, file);
    }

    @DeleteMapping("/deleteQuestion/{questionId}")
    public void deleteQuestion(@PathVariable("questionId") UUID questionId) {
        questionService.deleteQuestion(questionId);
    }
}
