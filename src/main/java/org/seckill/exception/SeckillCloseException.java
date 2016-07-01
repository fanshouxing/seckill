

package org.seckill.exception;

import org.seckill.dto.SeckillExecution;

/**
 * 秒杀关闭异常
 * Created by FanShouxing on 2016/6/28.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
