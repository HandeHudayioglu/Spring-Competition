package com.hande.competitionproje.mapper;
import com.hande.competitionproje.dto.request.RegisterRequestDto;
import com.hande.competitionproje.repository.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    User toUser(RegisterRequestDto dto);
}
