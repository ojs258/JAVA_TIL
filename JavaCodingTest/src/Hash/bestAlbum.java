package Hash;

import java.util.*;

public class bestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> total = new HashMap<>();
        Map<String, List<Song>> best = new HashMap<>();
        List<Integer> answer = new LinkedList<>();

        // totalMap에 각 장르별 재생 수 합계를 저장.
        for(int i = 0; i < genres.length; i++){
            total.put(genres[i],total.getOrDefault(genres[i],0)+plays[i]);
        }

        // 장르를 리스트로 변환 해서 장르별 재생 수를 기준으로 내림차순 정렬.
        List<String> sortTotal = new LinkedList<>(total.keySet());
        sortTotal.sort((o1,o2) -> total.get(o2).compareTo(total.get(o1)));

        // bestMap의 밸류List<Song>타입을 LinkedList로 초기화 해 주면서
        // 장르 별로 분류 해서 밸류List에 노래 정보(Song 객체)를 저장.
        for(int i = 0; i < genres.length; i++){
            best.putIfAbsent(genres[i],new LinkedList<>());
            best.get(genres[i]).add(new Song(plays[i], i));
        }

        // 장르 별로 분류 되어있는 노래 정보를 객체 안에 오버 라이딩 해놓은
        //  compareTo 메서드를 이용해 재생 수의 내림차순으로 정렬.
        for(List<Song> songs : best.values()){
            Collections.sort(songs);
        }

        // 정답 리스트 answer에 subList()메서드를 이용해 각 장르병 TOP2를 골라서 저장 한다.
        // 만약 하나의 장르에 해당 하는 노래가 하나 밖에 없다면 songs.size()가 1이 되므로
        // Math.min()메서드에 의해 TOP1만 answerList에 저장 된다.
        for(String str : sortTotal){
            List<Song> songs = best.get(str);
            List<Song> subSongs = songs.subList(0,Math.min(2,songs.size()));
            for(Song song : subSongs){
                answer.add(song.index);
            }
        }
        // 리턴 타입에 맞게 변환 해서 정답을 리턴
        return answer.stream().mapToInt(n -> n).toArray();
    }

    static class Song implements Comparable<Song> {
        int play;
        int index;

        public Song(int play, int index){
            this.play = play;
            this.index = index;
        }

        @Override
        public int compareTo(Song other){

            // 노래별 재생 수 desc 정렬
            return other.play - this.play;
        }

    }
    public static void main(String[] args) {
        int[] solution = new bestAlbum().solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}