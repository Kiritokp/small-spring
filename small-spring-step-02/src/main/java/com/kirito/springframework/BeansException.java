package com.kirito.springframework;

/**
 * @author kirito
 * @description: TODO
 * @date 2022-06-20 13:28
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
