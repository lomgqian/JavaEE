package service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.AppleDao;
import domain.Apple;
public class AppleService {
	private AppleDao appleDao;
    public void setAppleDao(AppleDao appleDao) {
        this.appleDao = appleDao;
    }

    public String getApples() {
        List<Apple> apples = appleDao.getApples();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
           
            return objectMapper.writeValueAsString(apples);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error converting to JSON";
        }
    }
}
