package service.impl;

import dto.UserDto;
import entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repo.UserRepository;
import service.UserService;
import ultils.CommonUtil;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username).orElse(new User());
        return CommonUtil.toObject(user, UserDto.class);
    }

    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user = userRepository.save(user);
        return CommonUtil.toObject(user, UserDto.class);
    }

    public UserDto updateUser(UserDto userDto) {
        User user = CommonUtil.toObject(userDto, User.class);
        user = userRepository.save(user);
        return CommonUtil.toObject(user, UserDto.class);
    }



}
