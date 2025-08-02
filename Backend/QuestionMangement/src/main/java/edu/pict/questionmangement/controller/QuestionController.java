package edu.pict.questionmangement.controller;

import edu.pict.questionmangement.dto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.QuestionResponseDTO;
import edu.pict.questionmangement.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions/{userId}")
    public List<QuestionResponseDTO> getQuestionByUserId(@PathVariable("userId") Long userId) {
        return null;
    }

    @DeleteMapping("/deleteQuestion/{questionId}")
    public void deleteQuestion(@PathVariable("questionId") Long questionId) {
        questionService.deleteQuestion(questionId);
    }

    @PostMapping("/addQuestion")
    public QuestionResponseDTO addQuestion(@RequestBody QuestionRequestDTO questionRequestDTO) {
        return questionService.createQuestion(questionRequestDTO);
    }

    @GetMapping("/getQuestion/{questionId}")
    public QuestionResponseDTO getQuestion(@PathVariable("questionId") Long questionId) {
        return questionService.getQuestionById(questionId).get();
    }

    @GetMapping("/questions")
    public Page<QuestionResponseDTO> getAllPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int size
    ) {
        return questionService.getPaginatedQuestions(page, size);
    }
}
