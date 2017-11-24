package pl.myjava.htmlreader.definitions;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by wucher198 on 19.06.16.
 */
public enum ElementType {
    ALL("<*>", "</*>"),
    DIV("<div>", "</div>");

    private static final Map<String, ElementType> byOpenning;

    static {
        byOpenning = new HashMap<String, ElementType>();

        for (ElementType element : ElementType.values()) {
            byOpenning.put(element.getOpenning(), element);
        }
    }

    private String openning;
    private String closing;

    private ElementType(String openning, String closing) {
        this.openning = openning;
        this.closing = closing;
    }

    public String getOpenning() {
        return this.openning;
    }

    public String getClosing() {
        return this.closing;
    }

    public ElementType getByOpenning(String openning) {
        ElementType result = byOpenning.get(openning);

        if (result == null) {
            throw new NoSuchElementException("No such element: " + openning);
        }

        return result;
    }
}

