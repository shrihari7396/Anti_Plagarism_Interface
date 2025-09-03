package edu.pict.userManagement.controller;

import edu.pict.userManagement.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserHistoryController {
    @Autowired
    private UserHistoryService userHistoryService;

}
