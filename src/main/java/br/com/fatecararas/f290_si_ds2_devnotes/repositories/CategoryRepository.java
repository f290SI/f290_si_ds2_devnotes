package br.com.fatecararas.f290_si_ds2_devnotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecararas.f290_si_ds2_devnotes.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
