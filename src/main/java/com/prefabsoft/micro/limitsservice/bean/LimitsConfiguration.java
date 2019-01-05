package com.prefabsoft.micro.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitsConfiguration {
    private int maximum;
    private int minimum;
}
