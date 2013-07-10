package com.test.mog.save;

import java.io.File;

import com.guba.mogilefs.MogileFS;
import com.guba.mogilefs.SimpleMogileFSImpl;

public class TestMogilefsDataSave {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MogileFS fs = new SimpleMogileFSImpl("testdomain", new String[] {"192.168.2.114:7001"});
			File file =  new File("E:\\v46.jpg");
			System.out.println(file.isFile());
			fs.storeFile("z.jpg", "testclass",file); // key  class
			System.out.println("store ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
