package ru.nsu.bayramov.socialrelationshipfinder.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.nsu.bayramov.socialrelationshipfinder.service.SocialRelationshipFinderService;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api/v1/social-relationship-finder")
@RequiredArgsConstructor
public class SocialRelationshipFinderController {
    private final SocialRelationshipFinderService socialRelationshipFinderService;

    @PostMapping("/")
    public void find(@RequestParam("file") MultipartFile file) throws IOException {
        socialRelationshipFinderService.find(file);
    }

}
