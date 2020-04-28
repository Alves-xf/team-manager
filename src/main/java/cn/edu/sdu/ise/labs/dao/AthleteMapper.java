package cn.edu.sdu.ise.labs.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "athleteMapper")
public interface AthleteMapper {

    Integer countByTeamCode(@Param("teamCode") String teamCode);

}