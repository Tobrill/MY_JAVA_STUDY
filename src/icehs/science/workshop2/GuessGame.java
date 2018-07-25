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
        		System.out.print(index + "��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
        		index++;
        		int userInput = getUserInput();
        		if ( userInput == compNo) {
        			System.out.println("�����մϴ�!!");
        			System.out.println("�����մϴ�. Bye~ Bye~");
        			break;
        		}else if (userInput > compNo) {
        			System.out.println(userInput + "���� �۽��ϴ�.");
        		}else {
        			System.out.println(userInput + "���� Ů�ϴ�.");
        		}
        	}else {
        		System.out.print(index + "��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
        		int userInput = getUserInput();
        		if ( userInput == compNo) {
        			System.out.println("�����մϴ�!!");
        			System.out.println("�����մϴ�. Bye~ Bye~");
        		}else if (userInput > compNo) {
        			System.out.println(userInput + "���� �۽��ϴ�.");
        			System.out.println("�����մϴ�. Bye~ Bye~");
        		}else {
        			System.out.println(userInput + "���� Ů�ϴ�.");
        			System.out.println("�����մϴ�. Bye~ Bye~");
        		}
        	}
        	
        	
        }
        
      
        
        
    }
        
    
    /**
     * ������� �Է��� �޴� �޼ҵ�
     * 
     * @return ����ڰ� �Է��� ����
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
     * 1 ~ 100 ������ ���� �� �������� �ϳ��� ���ڸ� �����ϴ� �޼ҵ�
     * 
     * @return 1 ~ 100 �� �����ϰ� ���� ����
     */
    public static int getHiddenNumber() {
        
        Random rand = new Random();
        
        return rand.nextInt( 100 ) + 1;
    }
}
 