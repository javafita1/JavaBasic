package com.demo.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@GetMapping("/showForm")
	public String show() {
		
		return "upload";
	}

	    @PostMapping("/upload")
	    public String upload(

	            @RequestParam("name")
	            String name,

	            @RequestParam("resume")
	            MultipartFile file,

	            Model model)
	            throws Exception {

	        String fileName =
	                file.getOriginalFilename();

	        byte[] data =
	                file.getBytes();

	        Path path =
	                Paths.get(
	                "D:/Uploads/" + fileName);

	        Files.write(path, data);

	        model.addAttribute(
	                "name", name);

	        model.addAttribute(
	                "fileName", fileName);

	        return "success";

	    }

	

}
