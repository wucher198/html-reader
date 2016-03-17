package pl.myjava.htmlreader;

import pl.myjava.htmlreader.pl.myjava.htmlreader.errors.HtmlReaderException;
import pl.myjava.htmlreader.pl.myjava.htmlreader.utils.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;

/**
 * Created by wucher198 on 17.03.16.
 */
public class HtmlReaderImpl implements HtmlReader {
    private URL url;
    private URLConnection connection;
    private BufferedReader in;

    public void setPage(String pageUrl) throws HtmlReaderException {
        if (!Strings.isNullOrEmpty(pageUrl)) {
            try {
                url = new URL(pageUrl);
            } catch (MalformedURLException e) {
                throw new HtmlReaderException(e.getMessage());
            }
        }
    }

    public boolean openConnection() throws HtmlReaderException {
        try {
            if (url != null) {
                connection = url.openConnection();
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
        } catch (IOException e) {
            throw new HtmlReaderException(e.getMessage());
        }
    }

    public String returnPage() {
        Optional<String> result = Optional.empty();

        try {
            StringBuffer buffer = new StringBuffer();
            String line;

            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }

            result = Optional.of(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.orElse("");
    }
}
