package test;

import static org.junit.jupiter.api.Assertions.*;

import app.Conta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContaTest {
	
	public static Conta deposit;
	public static Conta withdraw;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		deposit = new Conta();
		withdraw = new Conta(1000, "123456");
	}

	@Test
	void depositTest() {
		assertEquals(0, deposit.getSaldo());
		deposit.contaDeposit(1000, "123456");
		assertEquals(1000, deposit.getSaldo());
		deposit.contaDeposit(-100, "123456");
	}
	
	@Test
	void withdrawTest() {
		assertEquals(1000, withdraw.getSaldo());
		withdraw.contaWithdraw(200, "12345");
		withdraw.contaWithdraw(900, "12345"); //Vai dar menos que zero
		withdraw.contaWithdraw(-100, "12345");		
	}
	
	void contadorTest() {
		assertEquals(2, withdraw.getContador());	
	}
}
