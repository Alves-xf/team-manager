package cn.edu.sdu.ise.labs.service.utils;

import cn.edu.sdu.ise.labs.dao.AthleteMapper;
import cn.edu.sdu.ise.labs.dao.TeamMapper;
import cn.edu.sdu.ise.labs.model.Team;
import cn.edu.sdu.ise.labs.utils.FormatUtils;
import cn.edu.sdu.ise.labs.vo.TeamVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TeamUtils {

    public static TeamVO convertToVO(Team team) {
        TeamVO teamVO = new TeamVO();
        BeanUtils.copyProperties(team, teamVO);
        teamVO.setCreatedAt(FormatUtils.formatFullDate(team.getCreatedAt()));
        teamVO.setUpdatedAt(FormatUtils.formatFullDate(team.getUpdatedAt()));
        return teamVO;
    }
}
