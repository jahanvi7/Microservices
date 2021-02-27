package com.cognizant.favorite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.favorite.dao.FavoriteDao;
import com.cognizant.favorite.exception.FavoriteEmptyException;
import com.cognizant.favorite.model.Favorite;

@Service
public class FavoriteService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FavoriteService.class);

	@Autowired
	private FavoriteDao favoriteDao;

	public FavoriteDao getFavoriteDao() {
		return favoriteDao;
	}

	public void setFavoriteDao(FavoriteDao favoriteDao) {
		this.favoriteDao = favoriteDao;
	}
	
	public void addFavorite(String userId, long movieId){
		LOGGER.info("Start");
		favoriteDao.addFavorite(userId, movieId);
	}
	
	public Favorite getAllFavorites(String userId) throws FavoriteEmptyException{
		return favoriteDao.getAllFavorites(userId);
	}
	
	public void removeFavorite(String userId, long movieId) throws FavoriteEmptyException {
		favoriteDao.removeFavorite(userId, movieId);
	}
}

