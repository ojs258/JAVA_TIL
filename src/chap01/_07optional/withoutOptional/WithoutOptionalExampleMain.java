package chap01._07optional.withoutOptional;

public class WithoutOptionalExampleMain {
    public static MapRepository mapRepository = new MapRepository();

    public static void main(String[] args) {
        printValue("EXIST_KEY");
        printValue("NOT_EXIST_KEY");
    }
    public static void printValue(String key){
        String string = mapRepository.getValue(key);
        System.out.println("String = " + string);

        if(string.isEmpty()){
            // 얻어온 value값을 싹 다 대문자로 바꿔서 출력
            System.out.println(string.toUpperCase());
        }
    }
}
