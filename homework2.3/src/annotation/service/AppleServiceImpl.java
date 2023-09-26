package annotation.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import annotation.dao.AppleDao;
import annotation.domain.Apple;

@Service("appleServiceImpl")
public class AppleServiceImpl implements AppleService{
	@Autowired
	private AppleDao appleDao;
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
