package com.tg.service;

import java.security.SecureRandom;

public class TokenGeneratorService {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomNo = random.nextInt(100);
        System.out.println("random no : " + randomNo);
    }
}