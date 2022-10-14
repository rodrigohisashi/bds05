package com.devsuperior.movieflix.entities.mappers;

import com.devsuperior.movieflix.dtos.UserDTO;
import com.devsuperior.movieflix.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);
}
