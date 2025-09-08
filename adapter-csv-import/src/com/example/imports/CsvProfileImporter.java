package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int count = 0;

        for (String[] row : rows) {
            if (row.length < 2) { 
                System.out.println("Skipped row: not enough columns");
                continue;
            }

            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row.length > 2 ? row[2].trim() : "";

            if (id.isEmpty()) {
                System.out.println("Skipped row: missing id");
                continue;
            }
            if (email.isEmpty()) {
                System.out.println("Skipped row: missing email");
                continue;
            }
            if (!email.contains("@")) {
                System.out.println("Skipped row: bad email");
                continue;
            }

            try {
                service.createProfile(id, email, displayName);
                count++;
            } catch (Exception e) {
                System.out.println("Skipped row: " + e.getMessage());
            }
        }

        return count;
    }
}
