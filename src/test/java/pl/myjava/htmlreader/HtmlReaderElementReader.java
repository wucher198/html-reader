package pl.myjava.htmlreader;

import org.testng.annotations.Test;

public class HtmlReaderElementReader {
	@Test
	public void testParseDIV() {
		String html = "<div id='some-id' class='some-class'>"
				+ "<p>Some Test Text</p>"
				+ "<a href='some-address' alt='some-alt-text'>Some text</a>"
				+ "</div>";
	}
}
