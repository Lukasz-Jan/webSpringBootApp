SELECT * FROM PRODUCT_COMPONENT_VERSION;

TNS for 64-bit Windows: 	11.2.0.1.0	Production


spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

    <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0.3</version>
        </dependency
        
mvn install:install-file -Dfile=D:\Instalki\Database_12c\database\stage\ext\jlib\ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar

https://stackoverflow.com/questions/44238622/missing-artifact-com-oracleojdbc6jar11-2-0-3