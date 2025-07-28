package com.stanchik.minio_project.service;

import io.minio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Service
public class FileService {
    @Autowired
    private MinioClient minioClient;

    @Value("${minio.bucket.name}")
    private String bucketName;

    public String uploadFile(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        InputStream fileStream = file.getInputStream();

        if(!minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build())) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }

        PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                .bucket(bucketName)
                .object(fileName)
                .stream(fileStream, file.getSize(), -1)
                .contentType(file.getContentType())
                .build();
        ObjectWriteResponse response = minioClient.putObject(putObjectArgs);

        return response.toString();
    };

    public void deleteFile(String fileName) throws Exception {
        RemoveObjectArgs removeObjectArgs = RemoveObjectArgs.builder()
                .bucket(bucketName)
                .object(fileName)
                .build();

        minioClient.removeObject(removeObjectArgs);
    }

    public InputStream downloadFile(String filename) throws Exception {
        return minioClient.getObject(GetObjectArgs.builder().bucket(bucketName).object(filename).build());
    }
}
