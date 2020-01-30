package br.ce.wcaquino.matchers;

import java.util.Calendar;

public abstract class MatchersProprios {

	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}

	public static DiaSemanaMatcher caiNumaSegunda() {
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}

	public static DataDiferencaDiasMatcher ehHojeComDiferencaDias(Integer qtaDias) {
		return new DataDiferencaDiasMatcher(qtaDias);
	}
	
	public static DataDiferencaDiasMatcher ehHoje() {
		return new DataDiferencaDiasMatcher(0);
	}

}
