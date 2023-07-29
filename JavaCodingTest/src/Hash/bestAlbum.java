package Hash;

import java.util.*;
import java.util.stream.Collectors;

public class bestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        List<Song> songs = new LinkedList<>();
        Map<String, Integer> total = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            songs.add(new Song(genres[i],i,plays[i]));
            total.put(genres[i],total.getOrDefault(genres[i],0)+plays[i]);
        }

        for(int i = 0; i < genres.length; i++){
            songs.get(i).setTotal(total.get(songs.get(i).genre));
        }
        Comparator<Song> reverse = Comparator.comparing(Song::getPlayCnt).reversed();
        songs.sort(Comparator.comparing(Song::getTotal).reversed()
                .thenComparing(reverse)
                .thenComparing(Song::getPk));

        int[] answer = new int[songs.size() - 1];
        for(int i = 0; i < songs.size() - 1; i++){
            answer[i] = songs.get(i).pk;
        }

        Map.Entry<Integer, Integer> integerIntegerEntry = Map.entry(1,1);
        List<Map.Entry<Integer, Integer>> abc = new LinkedList<>();

        abc.add(Map.entry(1234,18899));
        abc.add(Map.entry(13245,45645));
        abc.add(Map.entry(12,121234));
        abc.add(Map.entry(1123451,12123));
        abc.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));

        for (Map.Entry<Integer, Integer> integerEntry : abc) {
            System.out.println("integerEntry.getKey() = " + integerEntry.getKey());
        }

        List<Integer> ints = Arrays.stream(plays).boxed().collect(Collectors.toList();
        // 장르별 재생수 desc
        // 노래별 재생수 desc
        // 노래 고유번호 asc
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = new bestAlbum().solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Song {
    String genre;
    int pk;
    int playCnt;
    int total;

    public Song(String genre, int pk, int playCnt){
        this.genre = genre;
        this.pk = pk;
        this.playCnt = playCnt;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    public int getPlayCnt(){
        return playCnt;
    }

    public int getPk(){
        return pk;
    }
}
