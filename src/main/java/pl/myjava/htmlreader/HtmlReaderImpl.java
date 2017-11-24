package pl.myjava.htmlreader;

import pl.myjava.htmlreader.errors.HtmlReaderException;
import pl.myjava.htmlreader.utils.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * Created by wucher198 on 17.03.16.
 */
public class HtmlReaderImpl implements HtmlReader {
    private URL url;
    private URLConnection connection;
    private BufferedReader in;

    private Map<String, String> htmlTagsToRead = new HashMap<String, String>();

    public void setPage(String pageUrl) throws HtmlReaderException {
        if (!Strings.isNullOrEmpty(pageUrl)) {
            try {
                url = new URL(pageUrl);
            } catch (MalformedURLException e) {
                throw new HtmlReaderException(e.getMessage());
            }
        }
    }

    public void openConnection() throws HtmlReaderException {
        try {
            if (url != null) {
                connection = url.openConnection();
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
        } catch (IOException e) {
            throw new HtmlReaderException(e.getMessage());
        }
    }

    public void addHtmlTagToRead(String tag) {

    }

    public String returnPage() {
        return Optional.ofNullable(readLine()).orElse("");
    }

    public void closeConnection() throws HtmlReaderException {
        if (connection != null && in != null) {
            try {
                in.close();
            } catch (IOException e) {
                throw new HtmlReaderException(e.getMessage());
            } finally {
                in = null;
                connection = null;
            }
        }
    }

    private void readTags() {

    }

    // TODO Try find tags one by one during read of page. Read page only once.
    private void readTag(String attribute, String name) {
        String line = readLine();
    }

    // TODO Change it to read really only one line
    private String readLine() {
        StringBuffer buffer = new StringBuffer();
        String line;

        try {
            while ((line = in.readLine()) != null) {
                buffer.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }
}
