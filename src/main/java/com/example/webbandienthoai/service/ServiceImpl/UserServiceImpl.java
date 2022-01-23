package com.example.webbandienthoai.service.ServiceImpl;

import com.example.webbandienthoai.model.entity.UserEntity;
import com.example.webbandienthoai.model.request.UserRequest;
import com.example.webbandienthoai.model.respone.UserRespone;
import com.example.webbandienthoai.repository.UserRepository;
import com.example.webbandienthoai.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements IUserService {
    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserRespone> getList() {
        ModelMapper modelMapper = new ModelMapper();
        List<UserEntity> userEntities = userRepository.findAll();


        List<UserRespone> userResponses = userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity,UserRespone.class)).collect(Collectors.toList());

        return userResponses;
    }

    @Override
    public UserRespone insert(UserRequest userRequest) {
        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(userRequest,UserEntity.class);

        /**
         * JDBC
         * hibernate
         * - tu build tat ca cac method get list, insert, udpate...
         * - dung jpa tu dong co tat ca cac method tren
         */
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity,UserRespone.class);
    }

    public UserRespone findByUserName(String username) {

        return modelMapper.map(userRepository.findByUsername(username),UserRespone.class);
    }


}
