package com.pw.camel.camelrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

//@Configuration
public class AwsS3ClientConfig {

    String awsBucketAccessKey = "AKIA4XQFANJ5YXTYQE5A";

    String awsBucketSecretKey = "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";

    // @Bean
    public S3Client s3Client() {
        S3Client s3Client = S3Client.builder().credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(awsBucketAccessKey, awsBucketSecretKey)))
                .region(Region.US_EAST_1).build();
        return s3Client;
    }
}
