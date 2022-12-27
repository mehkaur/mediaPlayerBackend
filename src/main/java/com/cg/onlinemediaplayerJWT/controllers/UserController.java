package com.cg.onlinemediaplayerJWT.controllers;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.cg.onlinemediaplayerJWT.models.Video;
import com.cg.onlinemediaplayerJWT.security.services.UserVideoService;

//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RequestMapping("/api")
@RestController
public class UserController {
	
	@Autowired
	private UserVideoService service;
	
//Get All Video 		
		@GetMapping("/getall") // Endpoints
		@PreAuthorize("hasRole('USER')")
		public List<Video> getAllEmps() {
//			LOG.info("getAllEmps");
				return service.getAllVideo();
		}
		
//Post video
		
		@PostMapping("/postvideo")
		@PreAuthorize("hasRole('USER')")
		public Video addVideo(@RequestBody Video video) {
				return service.postVideo(video);
		}		
		
//Edit Video
		@PutMapping("editvideo/{videoId}")
		@PreAuthorize("hasRole('USER')")
		public ResponseEntity<Video> editvideo(@PathVariable String videoId, @RequestBody Video newVideo){
			newVideo.setVideoId(videoId);
			Video updateVideo =service.editVideo(newVideo);
			return ResponseEntity.ok(updateVideo);
		}		
		

// Delete a video
		@DeleteMapping("/deletejob/{videoId}")
		@PreAuthorize("hasRole('USER')")
		public int deleteVideo(@PathVariable int videoId) {
				return service.deleteVideo(videoId);

		}

		
//Search video by Category
		
		
		
//Search video by Tag 
		
		

}