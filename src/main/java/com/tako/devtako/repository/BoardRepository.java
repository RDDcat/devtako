package com.tako.devtako.repository;

import com.tako.devtako.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
