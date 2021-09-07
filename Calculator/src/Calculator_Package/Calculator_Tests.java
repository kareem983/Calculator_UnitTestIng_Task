package Calculator_Package;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Calculator_Tests {

	//************************************Main Function Tests*************************************
	@Test
	public void main_TestInput_1() {
		
		String input = "1\n2\n+";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "The Output = 3.0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_2() {
		
		String input = "5\n1\n-";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "The Output = 4.0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}

	@Test
	public void main_TestInput_3() {
		
		String input = "5\n6\n*";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "The Output = 30.0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_4() {
		
		String input = "6\n3\n/";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "The Output = 2.0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_5() {
		
		String input = "6\n0\n/";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "Can't Divide by 0" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_6() {
		
		String input = "5\n2\n/";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "The Output = 2.5" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_7() {
		
		String input = "5\n2\n+-";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter The Operation(+ , - , * , /): " + System.getProperty("line.separator");
		ConsoleOut+= "Invalid Operation" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_8() {
		
		String input = "a\n2\n+";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Please Enter Numbers" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_9() {
		
		String input = "5\na\n+";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Enter Number2: " + System.getProperty("line.separator");
		ConsoleOut+= "Please Enter Numbers" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	@Test
	public void main_TestInput_10() {
		
		String input = "+\na\n*";
		
		String ConsoleOut = "Enter Number1: " + System.getProperty("line.separator");
		ConsoleOut+= "Please Enter Numbers" + System.getProperty("line.separator");
		
		Invoke_main_CheckOut(input, ConsoleOut);
	}
	
	private void Invoke_main_CheckOut(String input, String ConsoleOut) {
		
		//redirect input and output into ByteArray
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		//invoke main fun
		String[] args = {};
		Calculator.main(args);
		
		// check if the test pass or not by comparing the acutal output with expected output
		assertEquals(ConsoleOut, out.toString());
	}
	
	//********************************************************************************************
	
	
	
	
	
	//************************************Valid Tests*************************************
	@Test
	public void test_Add_Operation_1() {
		assertEquals(2, Calculator.Add_Operation(1, 1), 0);
	}
	
	@Test
	public void test_Add_Operation_2() {
		assertEquals(-7, Calculator.Add_Operation(-5, -2), 0);
	}
	
	@Test
	public void test_Add_Operation_3() {
		assertEquals(-3, Calculator.Add_Operation(-5, 2), 0);
	}
	
	@Test
	public void test_Add_Operation_4() {
		assertEquals(5, Calculator.Add_Operation(7, -2), 0);
	}
	
	@Test
	public void test_Add_Operation_5() {
		assertEquals(7, Calculator.Add_Operation(7, 0), 0);
	}
	
	@Test
	public void test_Add_Operation_6() {
		assertEquals(6.2, Calculator.Add_Operation(4, 2.2), 0);
	}
	
	
	
	
	@Test
	public void test_Sub_Operation_1() {
		assertEquals(30, Calculator.Subtract_Operation(50, 20), 0);
	}
	
	@Test
	public void test_Sub_Operation_2() {
		assertEquals(-18, Calculator.Subtract_Operation(-20, -2), 0);
	}
	
	@Test
	public void test_Sub_Operation_3() {
		assertEquals(-17, Calculator.Subtract_Operation(-15, 2), 0);
	}
	
	@Test
	public void test_Sub_Operation_4() {
		assertEquals(13, Calculator.Subtract_Operation(11, -2), 0);
	}
	
	@Test
	public void test_Sub_Operation_5() {
		assertEquals(-5, Calculator.Subtract_Operation(0, 5), 0);
	}
	
	@Test
	public void test_Sub_Operation_6() {
		assertEquals(5.3, Calculator.Subtract_Operation(5.5, 0.2), 0);
	}
	
	
	
	
	@Test
	public void test_Mul_Operation_1() {
		assertEquals(30, Calculator.Multiply_Operation(5, 6), 0);
	}
	
	@Test
	public void test_Mul_Operation_2() {
		assertEquals(14, Calculator.Multiply_Operation(-7, -2), 0);
	}
	
	@Test
	public void test_Mul_Operation_3() {
		assertEquals(-45, Calculator.Multiply_Operation(-15, 3), 0);
	}
	
	@Test
	public void test_Mul_Operation_4() {
		assertEquals(-22, Calculator.Multiply_Operation(11, -2), 0);
	}
	
	@Test
	public void test_Mul_Operation_5() {
		assertEquals(0, Calculator.Multiply_Operation(0, -2), 0);
	}
	
	@Test
	public void test_Mul_Operation_6() {
		assertEquals(8.049999999999999, Calculator.Multiply_Operation(2.3, 3.5), 0);
	}
	
	
	
	
	@Test
	public void test_Divid_Operation_1() {
		assertEquals(6, Calculator.Divide_Operation(30, 5), 0);
	}
	
	@Test
	public void test_Divid_Operation_2() {
		assertEquals(5, Calculator.Divide_Operation(-20, -4), 0);
	}
	
	@Test
	public void test_Divid_Operation_3() {
		assertEquals(-5, Calculator.Divide_Operation(-15, 3), 0);
	}
	
	@Test
	public void test_Divid_Operation_4() {
		assertEquals(2.5, Calculator.Divide_Operation(5, 2), 0);
	}
	
	@Test
	public void test_Divid_Operation_5() {
		assertEquals(0, Calculator.Divide_Operation(0, -2), 0);
	}
	
	@Test
	public void test_Divid_Operation_6() {
		assertEquals(Calculator.ERROR_NUM, Calculator.Divide_Operation(50, 0), 0);
	}
	//************************************************************************************
	
	
	
	
	
	
	
	//************************************INValid Tests***********************************
	@Test
	public void test_Add_Operation_7() {
		assertFalse(10 == Calculator.Add_Operation('5', 2));
	}
	
	@Test
	public void test_Add_Operation_8() {
		assertFalse(2 == Calculator.Add_Operation(-7, -3));
	}
	
	@Test
	public void test_Add_Operation_9() {
		assertFalse(5 == Calculator.Add_Operation(-4, 10));
	}
	
	@Test
	public void test_Add_Operation_10() {
		assertFalse(5.5 == Calculator.Add_Operation(2.3, '2'));
	}
	
	
	
	
	@Test
	public void test_Sub_Operation_7() {
		assertFalse(-10 == Calculator.Subtract_Operation(5, '2'));
	}
	
	@Test
	public void test_Sub_Operation_8() {
		assertFalse(0 == Calculator.Subtract_Operation(-7, -3));
	}
	
	@Test
	public void test_Sub_Operation_9() {
		assertFalse(5 == Calculator.Subtract_Operation(-4, '6'));
	}
	
	@Test
	public void test_Sub_Operation_10() {
		assertFalse(0.5 == Calculator.Subtract_Operation(2.3, 2));
	}
	
	
	
	
	@Test
	public void test_Mul_Operation_7() {
		assertFalse(-10 == Calculator.Multiply_Operation(5, '2'));
	}
	
	@Test
	public void test_Mul_Operation_8() {
		assertFalse(0 == Calculator.Multiply_Operation(-7, -3));
	}
	
	@Test
	public void test_Mul_Operation_9() {
		assertFalse(5 == Calculator.Multiply_Operation(-4, 6));
	}
	
	@Test
	public void test_Mul_Operation_10() {
		assertFalse(0.5 == Calculator.Multiply_Operation(2.3, 2));
	}
	
	
	
	
	@Test
	public void test_Divid_Operation_7() {
		assertFalse(2 == Calculator.Divide_Operation('5', 2));
	}
	
	@Test
	public void test_Divid_Operation_8() {
		assertFalse(0 == Calculator.Divide_Operation(-7, -3));
	}
	
	@Test
	public void test_Divid_Operation_9() {
		assertFalse(2 == Calculator.Divide_Operation(-4, 0));
	}
	
	@Test
	public void test_Divid_Operation_10() {
		assertFalse(1.5 == Calculator.Divide_Operation(2.3, 2));
	}
	//************************************************************************************
	
	
}
