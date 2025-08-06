package edu.pict.questionmangement.controller;

import edu.pict.questionmangement.dto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.QuestionResponseDTO;
import edu.pict.questionmangement.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/questions/admin")
public class AdminQuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/addQuestion")
    public QuestionResponseDTO addQuestion(@RequestBody QuestionRequestDTO questionRequestDTO) {
        return questionService.addQuestion(questionRequestDTO);
    }

    @DeleteMapping("/deleteQuestion/{questionId}")
    public void deleteQuestion(@PathVariable("questionId") UUID questionId) {
        questionService.deleteQuestion(questionId);
    }
}
