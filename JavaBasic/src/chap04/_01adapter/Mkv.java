package chap04._01adapter;

public class Mkv implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("Mkv 파일 실행 : "+fileName);
    }
}
