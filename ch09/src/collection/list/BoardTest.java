package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		// ArrayList 또는 Vector를 선택 사용
		// ArrayList<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		// board 객체 (게시글)
		Board board1 = new Board("제목 1", "내용 1", "글쓴이 1");
		Board board2 = new Board("제목 2", "내용 2", "글쓴이 2");
		Board board3 = new Board("제목 3", "내용 3", "글쓴이 3");
		
		// Board 객체를 Vector 리스트에 저장
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		// 게시글 1개 삭제(1번 인덱스)
		if(list.contains(board2)) {
			list.remove(board2); // 인덱스로 삭제 가능
		}
		
		// 맨 앞에 객체 가져오기 (0번 인덱스)
		System.out.println("title: " + list.get(0).getTitle());
		System.out.println("content: " + list.get(0).getContent());
		System.out.println("writer: " + list.get(0).getWriter());
		
		// 전체 목록
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " + 
					board.getContent() + ", " + board.getWriter());
		}

	}

}
