package idecore;

public class PythonLanguage implements Language {
    private String interpretedCode;

    @Override
    public void compile(String code) throws Exception {
        if(code == null || code.isEmpty()) {
            throw new Exception("Python code cannot be empty!");
        }
        interpretedCode = "Interpreted Python Code: " + code;
        System.out.println("Python Interpretation Successful");
    }

    @Override
    public void run() {
        System.out.println("Running Python: " + interpretedCode);
    }
}