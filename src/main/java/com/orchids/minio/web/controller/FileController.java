package com.orchids.minio.web.controller;

import com.orchids.minio.model.Result;
import com.orchids.minio.web.service.FileService;
import io.minio.errors.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @ Author qwh
 * @ Date 2024/6/4 14:09
 */
@Tag(name = "FileUpload")
@RestController
@RequestMapping("/minio")
public class FileController {
    @Autowired
    private FileService fileService;
    @Operation(summary = "文件上传")
    @PostMapping("fileload")
    public Result<String> upload(@RequestParam MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String url = fileService.upload(file);
        return Result.ok(url);
    }
}
