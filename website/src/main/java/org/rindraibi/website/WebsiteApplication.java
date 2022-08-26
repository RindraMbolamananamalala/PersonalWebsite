package org.rindraibi.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
//		
//		for(int i=1; i!=7; ++i) {
//			for(int j=1; j!=7; ++j) {
//				if((j+1)<7)
//					System.out.println("edge((" + i + ", " + (j) + "), (" + (i) + ", " + (j+1) + ")).");
//				if((i+1)<7)
//					System.out.println("edge((" + i + ", " + (j) + "), (" + (i+1) + ", " + (j) + ")).");
//				if((j-1)>0)
//					System.out.println("edge((" + i + ", " + (j) + "), (" + (i) + ", " + (j-1) + ")).");
//				if((i-1)>0)
//					System.out.println("edge((" + i + ", " + (j) + "), (" + (i-1) + ", " + (j) + ")).");
//			}
//		}
	}

}
