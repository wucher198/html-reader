package pl.myjava.htmlreader;

import pl.myjava.htmlreader.pl.myjava.htmlreader.errors.HtmlReaderException;

/**
 * Created by wucher198 on 17.03.16.
 */
public interface HtmlReader {
    void setPage(String pageUrl) throws HtmlReaderException;
    boolean openConnection() throws HtmlReaderException;
    String returnPage();
}
