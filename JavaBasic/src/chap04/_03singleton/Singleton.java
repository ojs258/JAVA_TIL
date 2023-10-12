package chap04._03singleton;

public class Singleton {
    // 1. 싱글턴 클래스는 자기 자신 타입을 멤버변수로 가지게 함.
    // static을 설정해서 공용변수로 만들어야 여러 경우에 레퍼런스(메모리상의 참조 주소)를 받아갈 수 있음.
    private static Singleton instance;

    // 2. 생성자를 private으로 막아서 외부에서 인스턴스를 새롭게 생성하지 못하게 막음.
    // 이러면 아래와 같이 자기 클래스 내부에서만 생성자를 호출할 수 있게 됨.
    private Singleton() {
        System.out.println("객체 생성 완료!");
    }

    // 3. getInstance()와 같이, 이미 생성된 instance멤버변수를 리턴해주는 메서드를 추가
    // 이 때, instance가 생성된 적이 없다면, 생성자를 호출해서 instance에 대입해주는 로직을 추가
    public static Singleton getInstance(){
        // 객체 생성은 단 한번만 이뤄지고, 객체없이도 호출되어야 하므로 static
        if(instance == null){   // instance가 생성된 적이 없어 null이라면 생성자 호출
            instance = new Singleton();
        }
        return instance;
    }
}
