package pl.myjava.htmlreader.definitions;

/**
 * Created by wucher198 on 19.06.16.
 */
public class Div extends Element {
    public Div(String id, String clazz) {
        super(id, clazz);
        setType(ElementType.DIV);
    }
}
