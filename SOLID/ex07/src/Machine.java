interface Machine {
    void print(String text);
    void scan(String dstPath);
    void fax(String number);
}


/*
 we sould not have a generic interface... we should have the interface for ll types and the file basicPrinter should only implement print method buts 
but its implementing scan and fax also..

 */