package com.example.demo.alien;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AlienRestController {
    private final AlienMapper alienMapper;

    @GetMapping("/furry")
    public FurryAlien furry(){
        SlimyAlien slimy = new SlimyAlien("Mike", SlimeType.SALTY);
        FurryAlien furryAlien = alienMapper.from(slimy);
        return furryAlien;
    }
}
