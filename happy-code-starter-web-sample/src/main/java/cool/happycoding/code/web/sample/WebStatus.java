package cool.happycoding.code.web.sample;

import cool.happycoding.code.base.common.ResultCode;

/**
 * description
 *
 * @author lanlanhappy 2020/11/30 9:18 下午
 */
public enum WebStatus implements ResultCode {

    /**
     * 参数错误
     */
    PARAM_ILLEGAL("400","参数错误");
    private String code;
    private String message;

    WebStatus(String code, String message){
        this.code = code;
        this.message = message;
    }
    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
