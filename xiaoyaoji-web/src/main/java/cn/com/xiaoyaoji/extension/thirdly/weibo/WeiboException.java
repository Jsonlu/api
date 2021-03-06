package cn.com.xiaoyaoji.extension.thirdly.weibo;

import cn.com.xiaoyaoji.extension.thirdly.exception.ThirdlyException;

/**
 * @author zhoujingjie
 * @date 2016-07-28
 */
public class WeiboException extends ThirdlyException {
    public WeiboException() {
        super();
    }

    public WeiboException(String message) {
        super(message);
    }

    public WeiboException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeiboException(Throwable cause) {
        super(cause);
    }

    protected WeiboException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
