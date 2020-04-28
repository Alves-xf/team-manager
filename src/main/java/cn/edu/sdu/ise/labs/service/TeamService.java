package cn.edu.sdu.ise.labs.service;

import cn.edu.sdu.ise.labs.dto.TeamDTO;
import cn.edu.sdu.ise.labs.model.Page;
import cn.edu.sdu.ise.labs.vo.TeamVO;

import java.util.List;

public interface TeamService {

    TeamVO getTeam(String teamCode);

    Page<TeamVO> listTeam(String teamName,String province,String contact,Integer page,Integer pageSize);

    String addTeam(TeamDTO teamDTO);

    String updateTeam(TeamDTO teamDTO);

    int deleteTeam(List<String> teamCodes);

}
