package com.cisco.security;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        // Load the JSON file in src/main/resources, which is in your classpath
        // TIP: look at using Jackson and Guava's Resources class
        //THESE DEPENDENCIES ARE ALREADY in your POM.XML

        //Determine the MIME type of the file (look at Apache tika-core)
        //Determine what the policy is for the file
        //TIP: Remember, we want the business logic to be separate so we can rip out this command line app
        //and replace it with an API in the future
    }
}
