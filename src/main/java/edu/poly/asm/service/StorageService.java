package edu.poly.asm.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

public interface StorageService {
    String getStorageFilename(MultipartFile file, String id);

    void store(MultipartFile file, String storageFilename);

    Resource loadAsResource(String filename);

    Path load(String filename);

    void delete(String storedFilename) throws IOException;

    void init();
}
