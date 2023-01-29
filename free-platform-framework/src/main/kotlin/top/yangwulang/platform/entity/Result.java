package top.yangwulang.platform.entity;

/**
 * @author yangwulang
 */
public class Result<T> {
    private String code;
    private String message;
    private T result;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Result<T> success(T result) {
        this.setCode("200");
        this.setMessage("操作成功");
        this.setResult(result);
        return this;
    }

    public Result<T> success(String message) {
        this.setCode("200");
        this.setMessage(message);
        return this;
    }


    public Result<T> failedResult(T result) {
        this.setCode("500");
        this.setMessage("错误");
        this.setResult(result);
        return this;
    }

    public Result<T> failed(String message) {
        this.setCode("500");
        this.setMessage(message);
        return this;
    }

}
