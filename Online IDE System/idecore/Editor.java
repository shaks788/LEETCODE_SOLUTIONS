package idecore;

public class Editor {
    private String code; // encapsulated field

    public void writeCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
