package com.geo.investbot.service;

import org.springframework.stereotype.Service;

@Service
public class BotServiceImpl implements BotService{
    @Override
    public String generateCarmaLink() {
        StringBuilder ref = new StringBuilder();
        int count = 8;
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwzyz1234567890";
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            ref.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return ref.toString();
    }
}
