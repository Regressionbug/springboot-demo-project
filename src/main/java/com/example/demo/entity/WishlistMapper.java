package com.example.demo.entity;

import com.example.demo.dao.Wishlist;
import java.util.List;

public interface WishlistMapper {
    int deleteByPrimaryKey(String owner);

    int insert(Wishlist record);

    Wishlist selectByPrimaryKey(String owner);

    List<Wishlist> selectAll();

    int updateByPrimaryKey(Wishlist record);
}