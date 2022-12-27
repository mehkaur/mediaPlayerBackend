package com.cg.onlinemediaplayerJWT.security.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.onlinemediaplayerJWT.models.Video;
import com.cg.onlinemediaplayerJWT.repository.UserVideoRepository;
import org.springframework.stereotype.Service;


@Service
public class UserVideoService {
	
//	private static final Logger LOG = (Logger) LoggerFactory.getLogger(UserVideo.class);

	@Autowired
	private UserVideoRepository repository;
	
//Get All Video 
	public List<Video> getAllVideo() {
//		LOG.info("get All Videos");
		return repository.findAll();
	}

	// Post Job
		public Video postVideo(Video video) {
//			LOG.info("addJob");
			return repository.save(video);
		}
	
		
		
		// Delete Job
		public int deleteVideo(int videoId) {
//			LOG.info("deleteJob");
			repository.deleteById(videoId);
			return videoId;
		}

		// Edit Job
		public Video editVideo(Video video) {
//			LOG.info("EditJob");
			return repository.save(video);
		}
	

}
