package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import app.Conversora;

class ConversoraTest {
	
	public static Conversora objeto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		objeto = new Conversora();
	}

	@Test
	void resultadoTest() {
		assertEquals(0.3048, Conversora.converterPesParaMetros(1));
		assertEquals(12, Conversora.converterPesParaPolegadas(1));
		assertEquals(30.48, Conversora.converterPesParaCentimetros(1));
		assertEquals(0.0254, Conversora.converterPolegadasParaMetros(1));
		assertEquals(0.0833333, Conversora.converterPolegadasParaPes(1));
		assertEquals(2.54, Conversora.converterPolegadasParaCentimetros(1));
		assertEquals(3.28084, Conversora.converterMetrosParaPes(1));
		assertEquals(39.3701, Conversora.converterMetrosParaPolegadas(1));
		assertEquals(100, Conversora.converterMetrosParaCentimetros(1));
		assertEquals(0.0328084, Conversora.converterCentimetrosParaPes(1));
		assertEquals(0.393701, Conversora.converterCentimetrosParaPolegadas(1));
		assertEquals(0.01, Conversora.converterCentimetrosParaMetros(1));
	}
}
