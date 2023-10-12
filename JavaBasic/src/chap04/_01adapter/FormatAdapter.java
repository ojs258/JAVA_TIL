package chap04._01adapter;

public class FormatAdapter implements MediaPlayer{
    private MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.println("어댑터를 사용해서 package를 player로 변환했습니다.");
        media.playFile(fileName);
    }
}
