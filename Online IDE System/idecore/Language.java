package idecore;

public interface Language {
    void compile(String code) throws Exception;
    void run();
}
