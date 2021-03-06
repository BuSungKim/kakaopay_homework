package com.kakaopay.homework.domain.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LocalFileReadRequest {
    @NotNull
    private String fileName;
    private String charset = "UTF-8";
}
