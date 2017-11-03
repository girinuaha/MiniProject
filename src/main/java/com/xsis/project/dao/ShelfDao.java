package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.Shelf;

public interface ShelfDao {

	public void save(Shelf shelf);

	public List<Shelf> getAllShelfs();

	public Shelf getShelfById(int id);

	public void update(Shelf customer);

	public void delete(int id);

}
