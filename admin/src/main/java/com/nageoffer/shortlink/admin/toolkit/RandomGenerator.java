package com.nageoffer.shortlink.admin.toolkit;

import java.util.Random;

/**
 * 随机字符串生成器
 */
public final class RandomGenerator {

    public static String generateRandom() {
        return generateRandomString(6);
    }

    /**
     * 生成指定长度的随机字符串
     * @param length 长度
     * @return 随机字符串
     */
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
}
