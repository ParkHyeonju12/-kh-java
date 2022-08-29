package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {

	public void test1() {
		//quiz.txt파일의 내용을 읽어올 예정
		 BufferedReader br = null;
		 //이미지로 내보낼 보조스트림
		 BufferedOutputStream bos = null;
		 
		 try {
			 //quiz.txt를 읽어오기위한 주스트림 생성
			FileReader fr = new FileReader("quiz.txt");
			//보조스트림을 통한 성능개선
			br = new BufferedReader(fr);
			//quiz.txt는 1줄짜리 파일로 한번만 읽으면 모든정보 로드 완료.
			String str = br.readLine();
			// " "띄어쓰기 기준으로 데이터를 잘라서 토큰으로 관라
			StringTokenizer sT = new StringTokenizer(str," ");
			//데이터 내보낼 때 byte스트림을 사용할 예정
			//읽어온 숫자를 Byte List 저장
			ArrayList<Byte> list = new ArrayList<Byte>();
			while(sT.hasMoreTokens()){
				String num = sT.nextToken();
				int iNum = Integer.parseInt(num);
				list.add((byte)iNum);
			}
			System.out.println("파일 읽어오기 완료");
			System.out.println("리스트 길이 : "+list.size());
			//이미지 파일을 내보내기위한 주스트림 생성
			FileOutputStream fos = new FileOutputStream("test.gif");
			//성능개선을 위한 보조스트림 생성
			bos = new BufferedOutputStream(fos);
			for(Byte b : list) {
				bos.write(b);
			}
			System.out.println("내보내기완료");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
