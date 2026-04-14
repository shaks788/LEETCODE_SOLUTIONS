package ide;

import idecore.*;
import idelog.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.log("Starting Online IDE...");

        IDE ide = new IDE();

        // Create editors with code for different languages
        Editor editor1 = new Editor();
        editor1.writeCode("System.out.println(\"Hello Java\");");

        Editor editor2 = new Editor();
        editor2.writeCode("print('Hello Python')");

        Editor editor3 = new Editor();
        editor3.writeCode("printf(\"Hello C\");");

        ide.addEditor(editor1);
        ide.addEditor(editor2);
        ide.addEditor(editor3);

        ide.showEditorCount();

        Language javaLang = new JavaLanguage();
        Language pythonLang = new PythonLanguage();
        Language cLang = new CLanguage();

        System.out.println("\n--- Java Execution ---");
        ide.compileAll(javaLang);

        System.out.println("\n--- Python Execution ---");
        ide.compileAll(pythonLang);

        System.out.println("\n--- C Execution ---");
        ide.compileAll(cLang);

        Logger.log("IDE Execution Finished.");
    }
}