// Interface (contract for submission handling)
interface SubmissionHandler {
    void submitCode(String code);
    void evaluate();
    void printSuccess(); // method for successful submission
}

// Abstract class (common base for all submissions)
abstract class Submission implements SubmissionHandler {
    private String studentName;   // Encapsulation
    private String code;

    // Constructor with parameters
    public Submission(String studentName, String code) {
        this.studentName = studentName;
        this.code = code;
    }

    // Overloaded constructor
    public Submission(String studentName) {
        this(studentName, "");
    }

    // Getters and setters (Encapsulation)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Abstract method (forces subclasses to implement)
    public abstract void evaluate();

    // Common method
    public void submitCode(String code) {
        this.code = code;
        System.out.println("Code submitted by "+studentName+": ");
        System.out.println(code);
    }

    // Default implementation of success message
    public void printSuccess() {
        System.out.println("Code submission by " + studentName + " was successful!");
    }
}

// JavaSubmission
class JavaSubmission extends Submission {
    public JavaSubmission(String studentName, String code) {
        super(studentName, code);
    }
    public JavaSubmission(String studentName) {
        super(studentName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Java code for " + getStudentName());
        if (getCode().contains("System.out.println")) {
            printSuccess();
        } else {
            System.out.println("Java submission failed basic checks!");
        }
    }
}

// PythonSubmission
class PythonSubmission extends Submission {
    public PythonSubmission(String studentName, String code) {
        super(studentName, code);
    }
    public PythonSubmission(String studentName) {
        super(studentName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Python code for " + getStudentName());
        if (getCode().contains("print(")) {
            printSuccess();
        } else {
            System.out.println("Python submission failed basic checks!");
        }
    }
}

// CSubmission
class CSubmission extends Submission {
    public CSubmission(String studentName, String code) {
        super(studentName, code);
    }
    public CSubmission(String studentName) {
        super(studentName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating C code for " + getStudentName());
        if (getCode().contains("printf")) {
            printSuccess();
        } else {
            System.out.println("C submission failed basic checks!");
        }
    }
}

// CppSubmission
class CppSubmission extends Submission {
    public CppSubmission(String studentName, String code) {
        super(studentName, code);
    }
    public CppSubmission(String studentName) {
        super(studentName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating C++ code for " + getStudentName());
        if (getCode().contains("cout")) {
            printSuccess();
        } else {
            System.out.println("C++ submission failed basic checks!");
        }
    }
}

// Main class to run the platform
public class Main {
    public static void main(String[] args) {
        Submission javaSub = new JavaSubmission("Alice", "public class HelloWorld { \npublic static void main(String[] args) { \n\tSystem.out.println(\"Hello\"); \n   } \n}");
        Submission pythonSub = new PythonSubmission("Bob", "def hello(): \n\tprint(\"Hello\")");
        Submission cSub = new CSubmission("Charlie", "#include <stdio.h>\nint main() { \n\tprintf(\"Hello\"); \n\treturn 0; \n}");
        Submission cppSub = new CppSubmission("Diana", "#include <iostream>\nusing namespace std;\nint main() { \n\tcout << \"Hello\"; \n\treturn 0; \n}");

        javaSub.submitCode(javaSub.getCode());
        javaSub.evaluate();
        System.out.println();

        pythonSub.submitCode(pythonSub.getCode());
        pythonSub.evaluate();
        System.out.println();

        cSub.submitCode(cSub.getCode());
        cSub.evaluate();
        System.out.println();

        cppSub.submitCode(cppSub.getCode());
        cppSub.evaluate();
        System.out.println();
    }
}
