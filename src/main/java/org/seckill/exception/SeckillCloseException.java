package org.seckill.exception;

/**
 * @author leikai
 * @Date 2018/11/20 9:49 PM
 * @Description: 秒杀关闭异常
 **/
public class SeckillCloseException extends SeckillException{


    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
