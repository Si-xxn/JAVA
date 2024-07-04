package ch14.collection.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector List 컬렉션의 자식 객체로 메서드가 같다.
		// 단, 동기화된 메서드로 구성되어있어 멀티스레드가 동시에 메서드를 실행할 수 없고
		// 하나의 스레드가 실행을 완료해야 다른 스레드를 실행할 수 있다.
		// 멀티스레드 환경에서 안전하게 객체를 추가, 삭제(좌석예약, 상품 재고)
		
		List<BoardDTO> listB = new Vector<BoardDTO>(); // 강한 타입 체크
		
		listB.add(new BoardDTO("제목1","내용1", "작성자1"));
		listB.add(new BoardDTO("제목2","내용2", "작성자2"));
		listB.add(new BoardDTO("제목3","내용3", "작성자3"));
		listB.add(new BoardDTO("제목4","내용4", "작성자4"));
		listB.add(new BoardDTO("제목5","내용5", "작성자5"));
		listB.add(new BoardDTO("제목6","내용6", "작성자6"));
		
		BoardDTO boardDTO = listB.get(1);
		System.out.println("---- Vector 객체의 인덱스 1번정보 ---");
		System.out.println(boardDTO.getSubject()+ " 제목");
		System.out.println(boardDTO.getContent()+" 내용");
		System.out.println(boardDTO.getWriter() + " 작성자");
		
		
		System.out.println("-------------------------------");
		Scanner scanner = new Scanner(System.in);
		BoardDTO newBoardDTO = new BoardDTO();
		System.out.print("제목 >> ");
		newBoardDTO.setSubject(scanner.next());
		System.out.print("내용 >> ");
		newBoardDTO.setContent(scanner.next());
		System.out.print("작성자 >> ");
		newBoardDTO.setWriter(scanner.next());
//		BoardDTO newBoardDTO = new BoardDTO(title, content, writer);
		
		listB.add(newBoardDTO);
		
		System.out.println(newBoardDTO.toString());
		
		System.out.println("---------- 전체 리스트 출력 ----------");
		for(BoardDTO list : listB) {
			System.out.println(list.getContent()+" "+list.getSubject()+" "+list.getWriter());
		}
		
		
		
		

	}

}
