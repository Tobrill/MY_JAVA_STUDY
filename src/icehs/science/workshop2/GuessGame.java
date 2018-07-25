package icehs.science.workshop2;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
 
public class GuessGame {
    
    public static void main( String[] args ) {
        
        int compNo = getHiddenNumber();
        int index = 1;
        
        for (int i = 1; i <= 10; i++) {
        	if ( i != 10) {
        		System.out.print(index + "번째 기회입니다. 숫자를 입력하세요 : ");
        		index++;
        		int userInput = getUserInput();
        		if ( userInput == compNo) {
        			System.out.println("축하합니다!!");
        			System.out.println("종료합니다. Bye~ Bye~");
        			break;
        		}else if (userInput > compNo) {
        			System.out.println(userInput + "보다 작습니다.");
        		}else {
        			System.out.println(userInput + "보다 큽니다.");
        		}
        	}else {
        		System.out.print(index + "번째 기회입니다. 숫자를 입력하세요 : ");
        		int userInput = getUserInput();
        		if ( userInput == compNo) {
        			System.out.println("축하합니다!!");
        			System.out.println("종료합니다. Bye~ Bye~");
        		}else if (userInput > compNo) {
        			System.out.println(userInput + "보다 작습니다.");
        			System.out.println("종료합니다. Bye~ Bye~");
        		}else {
        			System.out.println(userInput + "보다 큽니다.");
        			System.out.println("종료합니다. Bye~ Bye~");
        		}
        	}
        	
        	
        }
        
      
        
        
    }
        
    
    /**
     * 사용자의 입력을 받는 메소드
     * 
     * @return 사용자가 입력한 숫자
     */
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
    
    /**
     * 1 ~ 100 까지의 숫자 중 무작위로 하나의 숫자를 추출하는 메소드
     * 
     * @return 1 ~ 100 중 랜덤하게 뽑힌 숫자
     */
    public static int getHiddenNumber() {
        
        Random rand = new Random();
        
        return rand.nextInt( 100 ) + 1;
    }
}
 