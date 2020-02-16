package br.ce.wcaquino.matchers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {

	private Integer qtaDias;

	public DataDiferencaDiasMatcher(Integer qtaDias) {
		this.qtaDias = qtaDias;
	}

	public void describeTo(Description desc) {
		Date dataEsperada = DataUtils.obterDataComDiferencaDias(qtaDias);
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		desc.appendText(format.format(dataEsperada));
	}

	@Override
	protected boolean matchesSafely(Date data) {
		return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(qtaDias));
	}

}
