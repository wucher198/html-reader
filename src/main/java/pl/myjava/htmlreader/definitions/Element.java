package pl.myjava.htmlreader.definitions;

import java.util.List;
import java.util.Map;

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
<<<<<<< Updated upstream
     * Attributes of given element.
     */
    private List<Attributes<Object>> attributes;
=======
     * All attributes of element.
     */
    private Map<String, String> attributes;
    /**
     * Value of of element.
     */
    private String value;
>>>>>>> Stashed changes
    /**
     * Elements that will be read during reding this element.
     */
    private List<Element> elements;
    /**
     * Value of element.
     */
    private String value;

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
<<<<<<< Updated upstream
    
	public List<Attributes<Object>> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attributes<Object>> attributes) {
		this.attributes = attributes;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type != other.type)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Element [type=" + type + ", id=" + id + ", clazz=" + clazz + ", attributes=" + attributes
				+ ", elements=" + elements + ", value=" + value + "]";
	}	
=======

    public void addAttribute(String name, String value) {
        if (attributes != null) {
            attributes.put(name, value);
        }
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
>>>>>>> Stashed changes
}
