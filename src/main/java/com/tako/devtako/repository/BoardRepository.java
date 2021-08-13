package com.tako.devtako.repository;

import com.tako.devtako.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);

    List<Board> findByTitleOrContent(String title, String content);
}
