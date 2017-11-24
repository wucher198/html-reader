package pl.myjava.htmlreader.definitions;

import pl.myjava.htmlreader.common.HtmlConsts;

public class ElementFactory {	
	public Element get(String source) {
		if (!source.startsWith(HtmlConsts.ELEMENT_OPENING_START)) {
			// move to first <
		}
		
		String elementName = source.substring(source.indexOf(HtmlConsts.ELEMENT_OPENING_START), source.indexOf(" "));
		
		return null;
	}
	
	private Element getByName(String elementName) {
		ElementType element = ElementType.valueOf(elementName);
		Element result = null;
		
		switch(element) {
		case DIV:
//			result = new Div(id, clazz);
		}
		
		return result;
	}
}
