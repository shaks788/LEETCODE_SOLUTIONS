package idecore;

import java.util.ArrayList;
import java.util.List;

public class IDE {
    private List<Editor> editors = new ArrayList<>();

    public void addEditor(Editor editor) {
        editors.add(editor);
    }

    public void compileAll(Language lang) {
        for(Editor e : editors) {
            try {
                lang.compile(e.getCode());
                lang.run();
            } catch(Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    public void showEditorCount() {
        Integer count = editors.size();
        System.out.println("Total Editors: " + count.toString());
    }

