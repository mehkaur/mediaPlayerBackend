package com.cg.onlinemediaplayerJWT.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinemediaplayerJWT.models.Video;

public interface UserVideoRepository extends JpaRepository<Video, Integer> {

//	public abstract List<Video> findAllByOrderByvideoIdAsc();
	
//	public abstract List<Video> findByJobSal(double jobSal);
	
//    public abstract Video findByJobId(int videoId);
    
}
