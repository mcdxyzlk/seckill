package org.seckill.exception;

/**
 * @author leikai
 * @Date 2018/11/20 9:47 PM
 * @Description: 重复秒杀异常(运行期异常)
 **/
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
