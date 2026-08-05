package Problems.UrlScrapping;

import java.util.concurrent.Callable;

public class UrlScrapper implements Callable<Void> {

    private String url;

    public UrlScrapper(String url) {
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        Thread.sleep(200);
        return null;
    }
}
