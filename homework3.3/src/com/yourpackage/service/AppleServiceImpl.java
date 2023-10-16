package com.yourpackage.service;

import com.yourpackage.dao.AppleDaoImpl;
import com.yourpackage.domain.Apple;
import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl {
    private AppleDaoImpl appleDao;

    public AppleServiceImpl(AppleDaoImpl appleDao) {
        this.appleDao = appleDao;
    }

    public Apple getApple() {
        return appleDao.getApple();
    }
}
