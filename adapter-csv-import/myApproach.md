Abhi Code ki Current State

App.java: abhi bas placeholder hai. Usme comment likha hai ki CsvProfileImporter use karna hai.

NaiveCsvReader: ye bas CSV file ko line-by-line padhta hai aur split(",") karke string array return karta hai.

ProfileImporter interface: contract define karta hai (ek method importFrom(Path csvFile)) jo ek int return karega (kitne profiles import hue).

ProfileService: ye domain service hai jo ek profile banata hai aur internally validation karta hai.



--------------------------------------------------------------------------------------------
Hume Kya Karna Hai (Steps)

CsvProfileImporter class banani hai jo:

ProfileImporter ko implement kare.

Constructor me NaiveCsvReader aur ProfileService lega.

CSV file ko read karega using NaiveCsvReader.

Har row ko parse karega (id, email, displayName).

Validation karega (missing ya galat field to skip + error message print).

Valid rows ke liye ProfileService.createProfile() call karega.

Count karega kitne profiles import hue.

App.java me wiring karna hai:

User jab java com.example.imports.App users.csv chalaye, to wo CsvProfileImporter ka use kare aur summary print kare.