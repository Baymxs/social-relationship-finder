package ru.nsu.bayramov.socialrelationshipfinder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class SocialRelationshipFinderService {
    public void find(MultipartFile file) throws IOException {
        uploadFile(file);
    }


    private void uploadFile(MultipartFile file) throws IOException {
        file.transferTo(new File("input/" + file.getOriginalFilename()));
    }
}
