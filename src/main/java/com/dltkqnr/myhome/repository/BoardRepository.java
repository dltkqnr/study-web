package com.dltkqnr.myhome.repository;

import com.dltkqnr.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
