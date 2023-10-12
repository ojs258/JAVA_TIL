package chap04._04proxy;

public class ProxyPatternMain {
    public static void main(String[] args) {
        // 실제 객체를 만들어서 돌리는 케이스
        SomeInterface someInterface = new Service();
        Client client = new Client(someInterface);
        client.someClientMethod();

        // 클라이언트 코드의 변경 없이 전후 로직 추가하기
        someInterface = new Proxy();
        client = new Client(someInterface);
        client.someClientMethod();
    }
}
