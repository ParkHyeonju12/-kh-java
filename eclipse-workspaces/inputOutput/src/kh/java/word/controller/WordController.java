package kh.java.word.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import kh.java.word.view.WordView;

public class WordController {
	private ArrayList<String> words;
	private WordView view;
	private Random r;
	private int win;
	private int lose;
	
	public WordController() {
		super();
		words = new ArrayList<String>();
		getWordFile();
		view = new WordView();
		r = new Random();
//		System.out.println(words);
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1:
				startGame();
				break;
			case 2:
				break;
			case 0:
				break;
			}
		}
	}
	
	
	public void startGame() {
		// 1. words리스트에서 랜덤단어 1개 추출
		int random = r.nextInt(words.size());
		String word = words.get(random);
		view.startGame();
		view.comTurn(word);
		while (true) {
			char lastLetter = word.charAt(word.length() - 1);
			String userWord = view.userTurn(lastLetter);
			int userResult = checkWord(userWord, lastLetter);

			if (userResult == -1) {
				return;
			}else if(userResult == 1) {
				continue;
			}
			char userLastLetter = userWord.charAt(userWord.length()-1);
			word = comTurn(userLastLetter);
			if(word == null) {
				win++;
				view.winMsg();
				return;
			}else {
				view.comTurn(word);
			}
		}

	}

	public String comTurn(char userLastLetter) {
		// 1. 문자열을 저장할 ArrayList 생성
		// 2. words중에 사용자가 입력한 마지막 글로 시작하는 단어를 생성한 리스트에 add
		// 만약 마지막 글자로 시작하는 단어가 한개도 없으면 -> return null;
		// 단어가 있으면 단어중 랜덤단어 1개 리턴

		ArrayList<String> list = new ArrayList<String>();
		
		for(String word : words) {
			if (userLastLetter == word.charAt(0)) {
				list.add(word);
			}
		}
		if (list.size() == 0 /* list.isEmpty()로 써도 됨*/) {
			return null;
		} else {
			int random = r.nextInt(list.size());
			String word = list.get(random);
			return word;
		}
	}
	
	

	public int checkWord(String userWord, char lastLetter) {
		// 1. gg입력한 경우 -> return -1
		// 2. 정상인경우 -> 이전단어 끝글자와, 입력단어 첫글자가 일치
		// -> 이전단어끝글자와, 입력단어 첫글자가 일치
		// -> 입력한 단어가 words에 존재하는 경우
		// -> 위 두가지 조건 모두 만족하는 경우 return 0
		// 3. 비정상인경우
		// 3-1. 이전단어끝글자와, 입력단어 첫글자가 다른 경우
		// 3-2. 이전단어 끝글자와, 입력단어 첫글자는 다른데
		// 입력단어가 words에 존재하지 않는 경우
		// -> return 1
		boolean bool = words.contains(userWord);
		if (userWord.equals("gg")) {
			view.loseMsg();
			lose++;
			return -1;
		} 
		char firstLetter = userWord.charAt(0);
		if(firstLetter == lastLetter) {
			/*↓↓↓↓↓ 안에 words.indexOf(userWord) != -1써도 됨.*/
			if(words.contains(userWord)) {
				return 0;
			}else{
				//3-2
				view.noSearchWord();
				return 1;
			}
		}else {
			//3-1 이전단어끝글자와, 입력단어 첫글자가 다른경우
			view.wrongMs();
			return 1;
		}
	}

	public void getWordFile() {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("words.txt");
			br = new BufferedReader(fr);
			String str = br.readLine();
			while (true) {
				String word = br.readLine();
				if (word == null) {
					break;
				}
				words.add(word);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
