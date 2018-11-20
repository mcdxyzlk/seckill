package org.seckill.exception;

/**
 * @author leikai
 * @Date 2018/11/20 9:51 PM
 * @Description: 秒杀相关业务异常
 **/
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
