package com.orchids.minio.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ Author qwh
 * @ Date 2024/6/4 14:10
 */
@Data
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {
    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;
}
