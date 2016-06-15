package pl.myjava.htmlreader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wucher198 on 15.06.16.
 */
public class HtmlElementsReader<T extends Element> {
    private List<T> elements = new ArrayList<T>();

    public void put(T element) {

    }

    public Map<T, String> getElement() {
        Map<T, String> result = null;

        return result;
    }
}
