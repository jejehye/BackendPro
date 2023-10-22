package com.example.BackendPro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    @Transactional
    @Modifying
    @Query("update MemberEntity m set m.cust_type = ?0 where m.cust_type <> ?1")
    void UpdateCustType();

    void updateCust_typeByCust_typeNot();
}