package prac;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));


        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println(" 총 객체 수 : " + size);

        // 특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + " " + board.getContent() + " " + board.getWriter());

        // 객체 삭제
        list.remove(2);
        list.remove(2); // 2번 인덱스를 삭제하면 3번 인덱스3가 2번 인덱스로
                              // 변경되므로 다시 2번 인덱스를 제거할 수 있음
    }
}
