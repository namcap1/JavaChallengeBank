# Instructions

The instructions for this can be found [here](./instructions.md)

## Additional info 

This project is built using maven.

There is an excuetable jar file in which you can find [here](./target/Bank-1.0-SNAPSHOT.jar). To run this file via the terminal use java -jar Bank-1.0-SNAPSHOT.jar if you are inside the target directory or specify the file path. The main class for this execuetable jar is the [here](./src/main/java/Bank/Main.java). If you clone this down feel free to change this to what you want and then run the command mvn clean package. It will create a new jar file which you can execuete with the commands above. Currently it will print.

```
date || credit || debit || balance
14/01/2012 || || 500.00 || 2500.00
13/01/2012 || 2000.00 || || 3000.00
10/01/2012 || 1000.00 || || 1000.00
```
