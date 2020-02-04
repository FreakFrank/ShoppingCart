package com.vodafone.ismailk.shoppingcart.utilities;

import org.modelmapper.ModelMapper;

public class MappingObject extends ModelMapper {

    private static MappingObject modelMapper;

    private MappingObject(){
    }

    public static ModelMapper getInstance(){
        if (modelMapper == null)
            modelMapper = new MappingObject();
        return modelMapper;
    }

}
