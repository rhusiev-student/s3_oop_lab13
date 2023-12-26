package nl.r1a.task3;

import java.io.IOException;

public class FacadeExtractCompany {
    PDLReader pdlReader = new PDLReader();
    BrandFetch brandFetch = new BrandFetch();
    public String extractCompany(String domain) throws IOException {
        String fetchedData = brandFetch.fetch(domain);
        String pdlData = pdlReader.fetch().toString();
        return fetchedData + "\n" + pdlData;
    }
}
