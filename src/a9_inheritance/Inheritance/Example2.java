package a9_inheritance.Inheritance;

import java.util.Arrays;

/* 음악앨범을 관리하는 클래스
요구사항:
    앨범제목(title)- 문자열
    발매연도(releaseYear)- 정수
    앨범 내 곡들의 제목 배열(tracks)- 문자열 배열

다음 메소드들을 구현하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메서드
toString 오버라이딩 메서드
 */
class Album{
    private String title;
    private int releaseYear;
    private String[] tracks;



    public Album() {
    }

    public Album(String title, int releaseYear, String[] tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }


    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", tracks=" + Arrays.toString(tracks) +
                '}';
    }
}

public class Example2 {
    public static void main(String[] args) {

    }
}
