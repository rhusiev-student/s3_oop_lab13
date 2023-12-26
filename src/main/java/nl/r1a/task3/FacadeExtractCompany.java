package nl.r1a.task3;

import java.io.IOException;

public class FacadeExtractCompany {
    PDLReader pdlReader = new PDLReader();
    BrandFetch brandFetch = new BrandFetch();
    public Company extractCompany(String domain) throws IOException {
        String fetchedData = brandFetch.fetch(domain);
        // Split by lines
        String[] lines = fetchedData.split("\\r?\\n");
        String logoURL = lines[0].substring(5);
        String description = lines[1].substring(13);
        String pdlData = pdlReader.fetch().toString();
        Company company = new Company(domain, description, logoURL, pdlData);
        return company;
    }
}
