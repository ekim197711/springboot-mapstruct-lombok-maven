package com.example.demo.alien;

import com.example.demo.train.MyDateMapper;
import org.mapstruct.*;

@Mapper(uses = {MyDateMapper.class},componentModel = "spring")
public interface AlienMapper {

    @ValueMappings({
            @ValueMapping(source="CORROSIVE", target="POINTY"),
            @ValueMapping(source="STICKY", target="SHORT"),
            @ValueMapping(source="SALTY", target="FLAT"),
            @ValueMapping(source=MappingConstants.ANY_REMAINING, target="LONG"),
            @ValueMapping(source=MappingConstants.NULL, target="GREASY"),
    })
    public FurType from(SlimeType slime);

    @Mapping(source = "slimeType", target ="furtype" )
    public FurryAlien from(SlimyAlien slimy);
}
