package idecore;

public class JavaLanguage implements Language {
    private String byteCode;

    @Override
    public void compile(String code) throws Exception {
        if(code == null || code.isEmpty()) {
            throw new Exception("Java code cannot be empty!");
        }
        byteCode = "Compiled Java Bytecode for: " + code;
        System.out.println("✅ Java Compilation Successful");
    }

    @Override
    public void run() {
        System.out.println("▶ Running Java: " + byteCode);
    }
}
