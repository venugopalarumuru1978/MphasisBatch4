package com.DAO;

import java.util.List;

import com.beans.Cricket;

public interface CricketDAO {

	public void AddCricker(Cricket crk);
	public List<Cricket>  ShowAll();
	public Cricket Search(int cid);
	public void DelCricketer(Cricket crk);
	public void UpdateCricketer(Cricket crk);
	
}
