package com.test.mog.find;

import java.io.File;

import com.guba.mogilefs.MogileFS;
import com.guba.mogilefs.SimpleMogileFSImpl;

public class TestMogilefsDataFind {

	public static void main(String[] args) {
		try {
			MogileFS fs = new SimpleMogileFSImpl("testdomain", new String[] {"192.168.2.114:7001"});
			System.out.println(fs.getDomain());//domain
			fs.getFile("dev2", new File("E:\\v27.jpg")); //¶ÁÈ¡ÎÄ¼þ
			String[] path = fs.getPaths("dev2", true);
			for (String str : path ) {
				System.out.println(str); //http://192.168.2.114:7500/dev1/0/000/000/0000000003.fid
			}
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
