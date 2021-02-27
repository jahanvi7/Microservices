package com.cognizant.favorite.dao;

import org.springframework.stereotype.Component;

import com.cognizant.favorite.exception.FavoriteEmptyException;
import com.cognizant.favorite.model.Favorite;

@Component
public interface FavoriteDao {

	public void addFavorite(String userId, long movieId) ;
	
	public void removeFavorite(String userId, long movieId) throws FavoriteEmptyException;
	
	public Favorite getAllFavorites(String userId) throws FavoriteEmptyException;
}

