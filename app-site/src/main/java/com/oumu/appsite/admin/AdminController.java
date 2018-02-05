package com.oumu.appsite.admin;

import com.oumu.appsite.admin.repository.AppCustomerBasic;
import com.oumu.appsite.admin.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;

@Controller
@RequestMapping("/admin")
class AdminController {

    private static final Log logger = LogFactory.getLog(AdminController.class);
    private UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/username/{username}")
    public ResponseEntity<?> findUserById(@PathVariable String username) {
        try {
            AppCustomerBasic result = userService.findUserById(username);
            return new ResponseEntity<AppCustomerBasic>(result, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return new ResponseEntity("找不到用户", HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/sex/{sex}")
    public ResponseEntity
    findUserBySex(@PathVariable Long sex, @RequestParam(name = "page", defaultValue = "0") int page,
                  @RequestParam(name = "size", defaultValue = "4") int size) {
        try {
            Sort sort = new Sort(Sort.Direction.ASC, "userid");
            Pageable pageable = new PageRequest(page, size, sort);
            Page<AppCustomerBasic> result = userService.findAllBySex(sex, pageable);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e);
        }
        return new ResponseEntity("查找失败", HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity
    addUser(@RequestBody AppCustomerBasic appCustomerBasic) {
        try {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            encoder.encode(appCustomerBasic.getPasswd());
            AppCustomerBasic result = userService.addUser(appCustomerBasic);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e);
        }
        return new ResponseEntity("添加用户失败", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //bootstrap
    @RequestMapping("/bootstrap/users")
    public String showBootstrapGrid(Model model) {
        Page<AppCustomerBasic> usersPage = userService.findAllUsers(new PageRequest(0, 20));
        model.addAttribute("users", usersPage.getContent());
        return "Grid Template for Bootstrap";
    }


    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(8, new SecureRandom("youyouhuang".getBytes()));
        System.out.print(encoder.encode("youyouhuang"));
//        System.out.print(encoder.encode("youyouhuang"));
        //$2a$08$j9tO5zw2GKC2uqnaf4.BD.MGygOaoz.d3o2DJqkuDB47jU92BGPru
    }
}
