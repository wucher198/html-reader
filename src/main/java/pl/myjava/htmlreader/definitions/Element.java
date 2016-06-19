package pl.myjava.htmlreader.definitions;

import java.util.List;

/**
 * Created by wucher198 on 15.06.16.
 * Definition of Element with it subelements.
 */
public abstract class Element {
    /**
     * Element type;
     */
    private ElementType type;
    /**
     * HTML id of element;
     */
    private String id;
    /**
     * HTML class of element.
     */
    private String clazz;
    /**
     * Elements that will be read during reding this element.
     */
    private List<Element> elements;

    protected Element(String id, String clazz) {
        this.id = id;
        this.clazz = clazz;
    }

    public ElementType getType() {
        return type;
    }

    protected void setType(ElementType type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public String getClazz() {
        return this.clazz;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addElement(Element element) {
        if (elements != null) {
            elements.add(element);
        }
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
