package com.oumu.appsite.storage;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class UploadController {
    private static final Log logger = LogFactory.getLog(UploadController.class);

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public ResponseEntity uploadImg(@RequestParam("file") MultipartFile[] img) {
        try {
            img[0].transferTo(new File("D:\\applog\\" + img[0].getOriginalFilename()));
            img[1].transferTo(new File("D:\\applog\\" + img[1].getOriginalFilename()));
            return new ResponseEntity("上传成功", HttpStatus.OK);
        } catch (IOException e) {
            logger.error(e);
        }
        return new ResponseEntity("上传失败", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
