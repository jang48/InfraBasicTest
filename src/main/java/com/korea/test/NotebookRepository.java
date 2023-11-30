package com.korea.test;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {
    Optional<Notebook> findById(Long id);
}
