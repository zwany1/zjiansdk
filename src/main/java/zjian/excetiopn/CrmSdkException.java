package zjian.excetiopn;

public class CrmSdkException extends RuntimeException {
    private String code;

    public CrmSdkException(String message) {
        super(message);
    }

    public CrmSdkException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}