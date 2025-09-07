package com.example.report;
import java.nio.file.*; import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
       // JsonWriter jw = new JsonWriter(); 
       // Zipper z = new Zipper(); 
       // AuditLog log = new AuditLog();

       ReportBundleFacade facade = new ReportBundleFacade(
            new AuditLog(),
            new JsonWriter(),
            new Zipper()
        );
        
        // TODO: Replace the above with a single call to ReportBundleFacade.export(...)

        Path json = facade.export(data, Path.of("out"), "report");
        System.out.println("DONE " + json);
    }
}
