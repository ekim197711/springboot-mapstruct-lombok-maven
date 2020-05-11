package com.example.demo.alien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SlimyAlien {
    private String fullname;
    private SlimeType slimeType;
}
