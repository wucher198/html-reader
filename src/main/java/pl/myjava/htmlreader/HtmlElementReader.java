package pl.myjava.htmlreader;

import pl.myjava.htmlreader.definitions.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by wucher198 on 15.06.16.
 */
public class HtmlElementReader<T extends Element> {
    /**
     * Root element of this reader;
     */
    private T element;

    /**
     * Reads root element and try's to read.
     * @return
     */
    // TODO It should read one element and when it found another it
    // try's to read it too.
    public Map<T, String> getElement() {
        Map<T, String> result = null;

        return result;
    }
}
