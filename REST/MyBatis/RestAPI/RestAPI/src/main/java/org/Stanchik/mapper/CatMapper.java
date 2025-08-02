package org.Stanchik.mapper;

import org.Stanchik.entity.Cat;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CatMapper {
    @Insert("INSERT INTO cats(name, age) VALUES(#{name}, #{age}) ")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Cat cat);

    @Select("SELECT * FROM cats WHERE id = #{id}")
    Cat findById(@Param("id") int id);

    @Update("UPDATE cats SET name=#{name}, age=#{age} WHERE id=#{id}")
    void update(Cat cat);

    @Delete("DELETE FROM cats WHERE id=#{id}")
    void delete(@Param("id") int id);

}
