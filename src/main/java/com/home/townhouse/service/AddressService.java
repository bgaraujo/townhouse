package com.home.townhouse.service;

import com.home.dtos.address.AddressDTO;
import com.home.townhouse.entity.Address;
import com.home.townhouse.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AddressRepository addressRepository;

    public AddressDTO save(AddressDTO addressDTO){
        return null;
    }

    public List<AddressDTO> saveAll(List<AddressDTO> addressDTOList){
        List<Address> addressList =  modelMapper.map(addressDTOList, new TypeToken<List<Address>>(){}.getType());
        addressList = addressRepository.saveAll(addressList);
        return modelMapper.map(addressList, new TypeToken<List<AddressDTO>>(){}.getType());
    }
}
