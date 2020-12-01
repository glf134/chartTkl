package cn.tkl.dockTkl.service.impl;

import cn.tkl.dockTkl.mappers.UserMapper;
import cn.tkl.dockTkl.pojo.User;
import cn.tkl.dockTkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }

    @Override
    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> queryAll() {
        return this.userMapper.selectAll();
    }
}