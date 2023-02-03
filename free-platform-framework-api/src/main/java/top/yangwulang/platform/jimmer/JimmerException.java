package top.yangwulang.platform.jimmer;

public class JimmerException extends RuntimeException {

    public JimmerException() {
    }

    public JimmerException(String message) {
        super(message);
    }

    public JimmerException(String message, Throwable cause) {
        super(message, cause);
    }

    public JimmerException(Throwable cause) {
        super(cause);
    }

    public JimmerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
