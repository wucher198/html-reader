package pl.myjava.htmlreader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pl.myjava.htmlreader.errors.HtmlReaderException;

/**
 * Created by wucher198 on 21.03.16.
 */
public class HtmlReaderImplTest {
    private static final String PAGE_NAME = "http://www.lotto.pl/lotto/wyniki-i-wygrane";

    private HtmlReader htmlReader = new HtmlReaderImpl();

    @BeforeClass
    public void setUp() throws HtmlReaderException {
        htmlReader.setPage(PAGE_NAME);
        htmlReader.openConnection();
    }

    @AfterClass
    public void tearDown() throws HtmlReaderException {
        htmlReader.closeConnection();
        htmlReader = null;
    }

    @Test
    public void testReturnPage() throws Exception {
        String page = htmlReader.returnPage();
        System.out.println(page);
    }
}