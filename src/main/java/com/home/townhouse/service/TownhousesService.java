package com.home.townhouse.service;

import com.home.dtos.townhouses.TownhousesDTO;
import com.home.townhouse.entity.Address;
import com.home.townhouse.entity.Document;
import com.home.townhouse.entity.Townhouses;
import com.home.townhouse.exception.TownhousesNotFoundException;
import com.home.townhouse.repository.AddressRepository;
import com.home.townhouse.repository.DocumentRepository;
import com.home.townhouse.repository.TownhousesRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownhousesService {
    @Autowired
    private TownhousesRepository townhousesRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private DocumentRepository documentRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public TownhousesDTO create(TownhousesDTO townhousesDTO){
        Townhouses townhouses = modelMapper.map(townhousesDTO, Townhouses.class);

        List<Address> addressList =  modelMapper.map(townhousesDTO.getAddresses(), new TypeToken<List<Address>>(){}.getType());
        addressList = addressRepository.saveAll(addressList);
        townhouses.setAddress(addressList);

        List<Document> documentList = modelMapper.map(townhousesDTO.getDocuments(),
                new TypeToken<List<Document>>(){}.getType());
        documentList = documentRepository.saveAll(documentList);
        townhouses.setDocuments(documentList);

        townhouses = townhousesRepository.save(townhouses);

        return modelMapper.map(townhouses, TownhousesDTO.class);
    }

    public TownhousesDTO get(Long id) {
        return modelMapper.map(
                townhousesRepository.findById(id).orElseThrow(TownhousesNotFoundException::new),
                TownhousesDTO.class
        );
    }
}
