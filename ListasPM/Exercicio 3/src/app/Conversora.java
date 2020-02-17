package app;

public class Conversora {

	public static double converterPesParaMetros(double valor) {

		double metros = 0.3048, convertido;
		convertido = valor * metros;
		return convertido;
	}

	public static double converterPesParaPolegadas(double valor) {
		double convertido, polegadas = 12;
		convertido = valor * polegadas;
		return convertido;
	}

	public static double converterPesParaCentimetros(double valor) {
		double convertido, cm = 30.48;
		convertido = valor * cm;
		return convertido;
	}

	public static double converterPolegadasParaMetros(double valor) {
		double convertido, metros = 0.0254;
		convertido = valor * metros;
		return convertido;
	}

	public static double converterPolegadasParaPes(double valor) {
		double convertido, pes = 0.0833333;
		convertido = valor * pes;
		return convertido;
	}

	public static double converterPolegadasParaCentimetros(double valor) {

		double convertido, cm = 2.54;
		convertido = valor * cm;
		return convertido;

	}

	public static double converterMetrosParaPes(double valor) {
		double convertido, pes = 3.28084;
		convertido = valor * pes;
		return convertido;
	}

	public static double converterMetrosParaPolegadas(double valor) {
		double convertido, polegadas = 39.3701;
		convertido = valor * polegadas;
		return convertido;
	}

	public static double converterMetrosParaCentimetros(double valor) {
		double convertido, cm = 100;
		convertido = valor * cm;
		return convertido;
	}

	public static double converterCentimetrosParaPes(double valor) {
		double convertido, pes = 0.0328084;
		convertido = valor * pes;
		return convertido;
	}

	public static double converterCentimetrosParaPolegadas(double valor) {
		double convertido, polegadas = 0.393701;
		convertido = valor * polegadas;
		return convertido;
	}

	public static double converterCentimetrosParaMetros(double valor) {
		double convertido, metros = 0.01;
		convertido = valor * metros;
		return convertido;
	}
}
