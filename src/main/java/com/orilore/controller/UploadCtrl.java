package com.orilore.controller;


import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
public class UploadCtrl {
	@RequestMapping("/upload")
	public String uploadFile(HttpServletRequest request) {
		String url = "files/";
		MultipartHttpServletRequest msr = (MultipartHttpServletRequest)request;
		try {
			MultipartFile part = msr.getFile("photo");
			String on = part.getOriginalFilename();
			String ext = on.substring(on.lastIndexOf("."));
			String name = new Date().getTime()+ext;
			String path = request.getSession().getServletContext().getRealPath("/files/");
			File file = new File(path,name);
			part.transferTo(file);
			url+=name;
			return url;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
