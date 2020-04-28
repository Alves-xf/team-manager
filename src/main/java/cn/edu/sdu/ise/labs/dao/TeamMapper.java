package cn.edu.sdu.ise.labs.dao;


import cn.edu.sdu.ise.labs.model.Team;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "teamMapper")
public interface TeamMapper {

    List<Team> list(
            @Param("teamName") String teamName,
            @Param("province") String province,
            @Param("contact") String contact,
            @Param("offset") Integer offset,
            @Param("limit") Integer limit);

    Team getByTeamCode(@Param("teamCode") String teamCode);

    List<Team> listByTeamName(@Param("teamName") String teamName);

    int updateByPrimaryKey(Team record);

    Team getByCode(@Param("teamCode") String teamCode);

    int insert(Team record);

    int deleteByCode(@Param("teamCode") String teamCode);

    Integer count(@Param("teamName") String teamName, @Param("province") String province, @Param("contact") String contact);

}
