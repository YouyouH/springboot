package com.oumu.appsite.admin.service;

import com.oumu.appsite.admin.repository.AppCustomerBasic;
import com.oumu.appsite.admin.repository.AppCustomerBasicRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private static final Log log = LogFactory.getLog(UserService.class);

    private final AppCustomerBasicRepository userRepository;

    @Autowired
    public UserService(AppCustomerBasicRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AppCustomerBasic findUserById(String username) {
        log.info("findUserById");
        return userRepository.findAllByUsername(username);
    }

    public Page<AppCustomerBasic> findAllBySex(Long userSex, Pageable pageable) {
        return userRepository.findAllByUsersex(userSex, pageable);
    }

    public Page<AppCustomerBasic> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public AppCustomerBasic addUser(AppCustomerBasic user) {
        return userRepository.save(user);
    }

    public List<AppCustomerBasic> addUser(List<AppCustomerBasic> users) {
        return userRepository.save(users);
    }

}
