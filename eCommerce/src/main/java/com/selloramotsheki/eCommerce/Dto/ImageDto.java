package com.selloramotsheki.eCommerce.Dto;

import lombok.Data;

@Data
public class ImageDto {
    private Long imageId;
    private String imageName;
    private String downloadUrl;

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}

