package coms.RestAPIDataJpaApp.service;

import java.util.List;

import coms.RestAPIDataJpaApp.models.CricInfo;

public interface CricService {
	public void AddCricketer(CricInfo crk);
	public List<CricInfo> ShowAll();
	public CricInfo SearchCricketer(int crno);
	public void DeleteCric(int crno);
	public void ModifyCricInfo(CricInfo crk);
}
