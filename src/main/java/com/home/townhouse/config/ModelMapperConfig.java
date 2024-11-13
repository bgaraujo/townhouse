package com.home.townhouse.config;

import com.home.dtos.townhouses.TownhousesDTO;
import com.home.townhouse.entity.Townhouses;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.typeMap(Townhouses.class, TownhousesDTO.class).addMappings(mapper -> {
            mapper.map(Townhouses::getAddress, TownhousesDTO::setAddresses);
            mapper.map(Townhouses::getDocuments, TownhousesDTO::setDocuments);
        });

        return modelMapper;
    }
}