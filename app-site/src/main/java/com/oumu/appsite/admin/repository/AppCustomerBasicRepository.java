package com.oumu.appsite.admin.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author youyouhuang
 */
@Repository
public interface AppCustomerBasicRepository extends JpaRepository<AppCustomerBasic, Integer> {

//    @Modifying change needs this
//    @Transactional

//    @Query("select u from User u where u.user_Id=?1")

    //@Query("select new com.test.DTO.DemoDTO(s.id, s.status ,s.startTime,s.endTime) from com.test.entity.EntityDemo  s where  s.status = :status and s.startTime >= :searchDate and s.id in (:ids)")
    //    Page<ScheduleDTO> methodName(
    //            Pageable page, @Param(value = "status") int status ,  @Param(value = "searchDate") Date searchDate ,@Param(value = "ids") List<String> ids);

    AppCustomerBasic findAllByUsername(String username);

//    Slice<AppCustomerBasic> findAllByUsersex(Long activity, Pageable pageable);

    Page<AppCustomerBasic> findAllByUsersex(Long activity, Pageable pageable);


    @Override
    Page<AppCustomerBasic> findAll(Pageable pageable);

    @Override
    AppCustomerBasic save(AppCustomerBasic appCustomerBasic);

    List<AppCustomerBasic> save(List<AppCustomerBasic> appCustomerBasics);


}
