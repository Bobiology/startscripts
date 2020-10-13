package com.demo.project.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Application is running...");
		
		String test = null;
		
		File file = new File("path");
		
		System.out.println(test);
		
		testmethod("","","","","","","","","","","","","","","","","","","","","","","","","","","");
		
		String test2 = "";
		
		test = test2;
		
		System.out.println(test);
		
	}

	private static void testmethod(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11,
			String string12, String string13, String string14, String string15, String string16, String string17,
			String string18, String string19, String string20, String string21, String string22, String string23,
			String string24, String string25, String string26, String string27) {
		
		System.out.println(string);
		
		
	}

	@RequestMapping(value = "/test/", method = RequestMethod.GET, produces = { "application/xml", "text/xml",
			"application/json" }, consumes = { "application/xml", "text/xml", "application/json" })
	public @ResponseBody String test() {
		class Test {
			private String name;
			private String mobile;

			public Test() {
				name = "";
				mobile = "";
			}

			public Test(String name, String mobile) {
				this.name = name;
				this.mobile = mobile;
			}

			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the mobile
			 */
			public String getMobile() {
				return mobile;
			}

			/**
			 * @param mobile the mobile to set
			 */
			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			@Override
			public String toString() {
				return "Test [name=" + name + ", mobile=" + mobile + "]";
			}

		}
		return new Test("Bob", "073727828291").toString();
	}

}
