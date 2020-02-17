package test;

import app.Data;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {
	
	public static Data testeAno;
	public static Data testeFevereiro;
	public static Data testeSemana;
	
	@BeforeEach
	public void setUp() throws IOException{
		testeAno = new Data(2016,12,31);
		testeFevereiro = new Data(2016,2,28);
		testeSemana = new Data(1986,7,17);
	}

	@Test
	void testProximoDia() {
		testeAno.proximoDia();
		assertEquals(1, testeAno.getDia());
		assertEquals(2017, testeAno.getAno());
	}
	
	@Test
	void testEAnoBissexto(){
		assertTrue(testeFevereiro.eAnoBissexto());
		testeFevereiro.proximoDia();
		assertEquals(29, testeFevereiro.getDia());
		testeFevereiro = new Data(2015,2,28);
		assertFalse(testeFevereiro.eAnoBissexto());
		testeFevereiro.proximoDia();
		assertEquals(1, testeFevereiro.getDia());
	}
	
	@Test
	public void testAdcionaDias() {
		Data d1 = new Data(2027,12,31);
		d1.adicionaDias(3);
		assertEquals(3, d1.getDia());
	}
	
	@Test
	public void testDiaSemana() {
		testeSemana.diaDaSemana().equals("Quinta-feira");
	}
	
	@Test
	public void testMesExtenso() {
		System.out.println(testeSemana.porExtenso());
	}
}
