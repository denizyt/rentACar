package com.kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forResponse();
	ModelMapper forRequests();
}
