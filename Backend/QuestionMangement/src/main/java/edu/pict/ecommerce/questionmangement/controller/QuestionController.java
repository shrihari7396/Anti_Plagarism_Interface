package edu.pict.ecommerce.questionmangement.controller;

import edu.pict.ecommerce.questionmangement.dto.QuestionRequestDTO;
import edu.pict.ecommerce.questionmangement.dto.QuestionResponseDTO;
import edu.pict.ecommerce.questionmangement.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/addQuestion")
    public QuestionResponseDTO addQuestion(@RequestBody QuestionRequestDTO questionRequestDTO) {

        return null;
    }

    @GetMapping("/getQuestion/{questionId}")
    public QuestionResponseDTO getQuestion(@PathVariable("questionId") Long questionId) {
        return null;
    }

    @DeleteMapping("/deleteQuestion/{questionId}")
    public QuestionResponseDTO deleteQuestion(@PathVariable("questionId") Long questionId) {
        return null;
    }

    @GetMapping("/questions")
    public Page<QuestionResponseDTO> getAllPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int size
    ) {
        return questionService.getPaginatedQuestions(page, size);
    }
}
