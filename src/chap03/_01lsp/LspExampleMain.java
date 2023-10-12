package chap03._01lsp;

public class LspExampleMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.someMethod(new Parent());
        client.someMethod(new Child());
    }
}
