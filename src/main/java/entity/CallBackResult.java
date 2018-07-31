package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jac
 * @date 2018-07-31 16:04
 */
public class CallBackResult {
    private String code;
    private String msg;
    private List data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
