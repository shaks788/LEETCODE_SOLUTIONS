package idecore;

public class CLanguage implements Language {
    private String machineCode;

    @Override
    public void compile(String code) throws Exception {
        if(code == null || code.isEmpty()) {
            throw new Exception("C code cannot be empty!");
        }
        machineCode = "Compiled C Machine Code for: " + code;
        System.out.println("✅ C Compilation Successful");
    }

    @Override
    public void run() {
        System.out.println("▶ Running C Program: " + machineCode);
    }
}

