package edu.pict.questionmangement.controller;

import edu.pict.questionmangement.dto.QuestionResponseDTO;
import edu.pict.questionmangement.dto.TestCasesDto;
import edu.pict.questionmangement.dto.UUIDWrapper;
import edu.pict.questionmangement.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/questions/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/all")
    public Page<QuestionResponseDTO> getAllPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int size
    ) {
        return questionService.getPaginatedQuestions(page, size);
    }

    @GetMapping("/get/{questionId}")
    public QuestionResponseDTO getQuestion(@PathVariable("questionId") UUIDWrapper questionId) {
        UUID questionID = UUID.fromString(questionId.getUuid());
        return questionService.getQuestionById(questionID);
    }

}
