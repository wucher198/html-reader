package pl.myjava.htmlreader;

import pl.myjava.htmlreader.pl.myjava.htmlreader.errors.HtmlReaderException;

import static org.testng.Assert.*;

/**
 * Created by wucher198 on 21.03.16.
 */
public class HtmlReaderImplTest {
    private static final String PAGE_NAME = "http://lotto.pl";

    private HtmlReader htmlReader = new HtmlReaderImpl();

    @org.testng.annotations.BeforeClass
    public void setUp() throws HtmlReaderException {
        htmlReader.setPage(PAGE_NAME);
        htmlReader.openConnection();
    }

    @org.testng.annotations.AfterClass
    public void tearDown() throws HtmlReaderException {
        htmlReader.closeConnection();
        htmlReader = null;
    }

    @org.testng.annotations.Test
    public void testReturnPage() throws Exception {
        String page = htmlReader.returnPage();
        System.out.println(page);
    }
}