package org.Stanchik.service;

import org.Stanchik.entity.Cat;
import org.Stanchik.mapper.CatMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public class CatService {
    private final CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public Cat findById(int id) {
        return catMapper.findById(id);
    }

    public void insert(Cat cat) {
        catMapper.insert(cat);
    }

    public void update(Cat cat) {
        catMapper.update(cat);
    }

    public void delete(int id) {
        catMapper.delete(id);
    }
}
